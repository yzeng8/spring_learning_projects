package com.yonyou;

import com.yonyou.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisDemoApplicationTests {

    @Qualifier("redisTemplate")
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("yonyou:user:1","Jack");
        Object name = redisTemplate.opsForValue().get("yonyou:user:1");
        System.out.println("yonyou:user:1:"+name);

    }

    @Test
    void userSave() {
        User user = new User();
        user.setName("Lucy");
        user.setAge(18);
        redisTemplate.opsForValue().set("yonyou:user:2",user);
        Object name = redisTemplate.opsForValue().get("yonyou:user:2");
        System.out.println("yonyou:user:2:"+name);

    }

}
