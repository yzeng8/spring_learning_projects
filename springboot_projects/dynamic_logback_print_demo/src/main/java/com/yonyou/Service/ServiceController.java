package com.yonyou.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/servicebase"))
public class ServiceController {

    Logger logger = LoggerFactory.getLogger(ServiceController.class);

    @PostMapping
    public String print_main (){
        logger.info("This is in the service controller");
        logger.debug("1.This is a DEBUG level log message");
        logger.info("2.This is an INFO level log message");
        logger.warn("3.This is a WARN level log message");
        logger.error("4.This is an ERROR level log message");
        logger.info("------------------------------------");

        return "hello world!";
    }



}
