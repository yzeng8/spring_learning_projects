package com.yonyou.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping()
    private String getmembers(){
        redisTemplate.opsForHash().put("yonyou:user:2","name","Jack");
        redisTemplate.opsForHash().put("yonyou:user:2","age",20);
        Object val = redisTemplate.opsForHash().get("yonyou:user:1", "name");
        //Object val2 = redisTemplate.opsForHash().get();
        System.out.println("成功储存！");
        System.out.println(val);
        return "ha!";

    }


}
