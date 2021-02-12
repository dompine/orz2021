package com.dompine.orz2021;

import com.dompine.orz2021.user.entity.User;
import com.dompine.orz2021.user.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Orz2021ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void testFindGoods(){
        List<User> list = userMapper.selectList(null);
        for(User u:list){
            System.out.println(u);
        }
        Assert.assertEquals(2,list.size());
        list.forEach(System.out::println);
    }

}
