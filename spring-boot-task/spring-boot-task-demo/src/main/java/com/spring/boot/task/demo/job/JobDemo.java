package com.spring.boot.task.demo.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qinhuajiao
 * @date 2020年05月17日 22:21:59
 */
@Component
public class JobDemo {

    private Logger logger = LoggerFactory.getLogger(Logger.class);

    private final AtomicInteger counts = new AtomicInteger();

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void execute() {
        logger.info("[execute] [定时第 ({}) 次执行]", counts.incrementAndGet());
    }

    @Scheduled(fixedRate = 6000)
    public void taskJob(){
        logger.info("[taskJob] [现在时间是: {}]",df.format(new Date()));
    }
}
