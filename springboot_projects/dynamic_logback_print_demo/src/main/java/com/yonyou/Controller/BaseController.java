package com.yonyou.Controller;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/base"))
public class BaseController {

    Logger logger = LoggerFactory.getLogger(BaseController.class);

    @PostMapping
    public String print_main (){

        logger.info("This is in the base controller");
        logger.debug("1.This is a DEBUG level log message");
        logger.info("2.This is an INFO level log message");
        logger.warn("3.This is a WARN level log message");
        logger.error("4.This is an ERROR level log message");
        logger.info("------------------------------------");

        return "hello world!";
    }



}
