package com.yonyou.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public String index (){
        //logger.info("Index方法进入 -> {} ", "IndexController");

        logger.trace(" --- trace --- ");
        logger.debug(" --- debug --- ");
        logger.info(" --- info --- ");
        logger.warn(" --- warn --- ");
        logger.error(" --- error --- ");

        return "哈喽";

    }
}
