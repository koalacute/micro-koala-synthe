package com.koalacute.micro.koala.synthe.task;

import com.koalacute.micro.koala.synthe.service.notify.GameNotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 通知任务
 */
@Component
@Configurable
@EnableScheduling
public class GameNotifyTask {

    private static final Logger logger = LoggerFactory.getLogger(GameNotifyTask.class);

    @Autowired
    private GameNotifyService gameNotifyService;

    @Scheduled(cron = "0/20 * * * * *")
    public void gameNotify() {
        logger.info("[通知任务] GameNotifyTask -------> Start");
        try {
            gameNotifyService.gameNotify();
        } catch (Exception e) {
            logger.error("通知发生异常,异常信息:{}", e.getMessage());
        }
        logger.info("[通知任务] GameNotifyTask -------> Stop");
    }
}
