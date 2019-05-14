package com.koalacute.micro.koala.synthe.service.notify;

import com.koalacute.microkoala.utils.util.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameNotifyService {

    private static final Logger logger = LoggerFactory.getLogger(GameNotifyService.class);

    /**
     * 通知任务
     */
    public void gameNotify() throws Exception {
        //路由
        IGameNotifyService iGameNotifyService = (IGameNotifyService) ServiceUtil.getService("fgSendMessageServiceImpl");
        iGameNotifyService.gameNotify();
    }
}
