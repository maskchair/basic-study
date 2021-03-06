package com.springboot.database.vcontrol.flyway.demo.migration;

import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author qinhuajiao
 * @date 2020年05月08日 19:24:17
 */
public class V1_1__FixUsername extends BaseJavaMigration {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void migrate(Context context) throws Exception {
        // 创建 JdbcTemplate ，方便 JDBC 操作
        JdbcTemplate template = new JdbcTemplate(context.getConfiguration().getDataSource());
        // 查询所有用户，如果用户名为 yudaoyuanma ，则变更成 yutou
        template.query("SELECT id, username, password, create_time FROM users", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                // 遍历返回的结果
                do {
                    String username = rs.getString("username");
                    if ("yudaoyuanma".equals(username)) {
                        Integer id = rs.getInt("id");
                        template.update("UPDATE users SET username = ? WHERE id = ?",
                                "yutou", id);
                        logger.info("[migrate][更新 user({}) 的用户名({} => {})", id, username, "yutou");
                    }
                } while (rs.next());
            }
        });
    }

    @Override
    public Integer getChecksum() {
        // 默认返回，是 null 。
        return 11;
    }

    @Override
    public boolean canExecuteInTransaction() {
        // 默认返回，也是 true
        return true;
    }

    @Override
    public MigrationVersion getVersion() {
        // 默认按照约定的规则，从类名中解析获得。可以自定义
        return super.getVersion();
    }

}
