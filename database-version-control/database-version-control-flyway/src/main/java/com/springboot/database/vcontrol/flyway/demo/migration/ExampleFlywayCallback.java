package com.springboot.database.vcontrol.flyway.demo.migration;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author qinhuajiao
 * @date 2020年05月08日 19:12:18
 */
@Component
public class ExampleFlywayCallback implements Callback {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public boolean supports(Event event, Context context) {
        return false;
    }

    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return false;
    }

    @Override
    public void handle(Event event, Context context) {
        log.info("event: {}", event);
    }
}
