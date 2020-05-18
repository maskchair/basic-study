package com.spring.boot.task.demo.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qinhuajiao
 * @date 2020年05月17日 22:21:59
 */
@Component
public class JobDemo {

    private Logger logger = LoggerFactory.getLogger(Logger.class);

    private final AtomicInteger counts = new AtomicInteger();

    @Scheduled(fixedRate = 3000)
    public void execute() {
        logger.info("[execute][定时第 ({}) 次执行]", counts.incrementAndGet());
    }
}
