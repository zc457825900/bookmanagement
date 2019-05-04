package com.mycomp.myapp.web.rest;

import com.mycomp.myapp.BookmanagementApp;
import com.mycomp.myapp.domain.User;
import com.mycomp.myapp.repository.UserRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookmanagementApp.class)
public class MyTEST {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUser(){
        User user = new User();
        user.setLogin("hello");
        user.setEmail("123@qq.com");
        user.setActivated(true);
        user.setPassword(RandomStringUtils.random(60));
        user.setActivated(true);
        user.setFirstName("xiao");
        user.setLastName("ming");
        user.setLangKey("zn-ch");
        userRepository.saveAndFlush(user);
        System.out.println(userRepository.findOneByLogin("hello"));
    }
}
