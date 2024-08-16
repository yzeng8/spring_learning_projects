package com.yonyou.Controller;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import org.springframework.web.bind.annotation.*;


@RestController
public class NewInterfaceController {

    @PutMapping(value = "/base/{logLevel}")
    public String changeLogLevel(@PathVariable("logLevel") String logLevel) {

        Logger logger = LoggerFactory.getLogger(BaseController.class);
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        //Logger loggerController = loggerContext.getLogger("com.yonyou.Service");
        Level desiredLevel = Level.toLevel(logLevel,null);

        try {
            if (desiredLevel == null) {
                logger.error("无效的日志级别: {},请修改上传日志级别。", logLevel);
                throw new IllegalArgumentException("Invalid log level: " + logLevel);
                //return "非法参数修改!";
            }
            loggerContext.getLogger("com.yonyou.Service").setLevel(desiredLevel); //可以指定精细化

        } catch (Exception e) {
            logger.error("动态修改日志级别出错", e);
            return "参数修改有误！";
        }
        return "成功修改";
    }
}

