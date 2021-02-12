package com.dompine.orz2021.user.service.impl;

import com.dompine.orz2021.user.entity.User;
import com.dompine.orz2021.user.mapper.UserMapper;
import com.dompine.orz2021.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dompine
 * @since 2021-02-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
//    @Value("${appid}")
//    private String appid;
//    @Value("${secret}")
//    private String secret;
//
//    @Autowired
//    private UserMapper userMapper;
//    @Override
//    public User onLogin(String code) {
//        //把收到的json对象转换为map对象
//        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&js_code="
//                + code + "&grant_type=authorization_code";
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url, String.class);
//        Gson gson = new Gson();
//        Map map = gson.fromJson(response, Map.class);
//
//            User user = new User();
//            user.setUserOpenid((String) map.get("openid"));
//            if (this.saveOrUpdate(user)){
//                return user;
//            }
//        return null;
//    }
//
//    @Override
//    public void userInfo(long userId, String avatarUrl, Integer gender, String nickName) {
////        if (userMapper.selectById(userId).isPresent()) {
////            User user = userDao.findById(userId).get();
////            user.setAvatarUrl(avatarUrl);
////            user.setGender(gender);
////            user.setNickName(nickName);
////            userDao.save(user);
//        }
    }
