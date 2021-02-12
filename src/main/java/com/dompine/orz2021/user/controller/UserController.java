package com.dompine.orz2021.user.controller;


import com.dompine.orz2021.user.entity.User;
import com.dompine.orz2021.user.service.IUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dompine
 * @since 2021-02-11
 */
@RestController
@RequestMapping("/user/user")
public class UserController {
//
//    @Autowired
//    private IUserService iUserService;
//
//    @RequestMapping(value = "onLogin")
//    @ResponseBody
//    User getByCode(@RequestParam("code") String code) {
//
//        return iUserService.onLogin(code);
//    }
//
//    @RequestMapping(value = "userinfo")
//    @ResponseBody
//    void userInfo(@RequestParam("userId") long userId, @RequestParam("avatarUrl") String avatarUrl, @RequestParam("gender") Integer gender, @RequestParam("nickName") String nickName) {
////        iUserService.
//    }
}

