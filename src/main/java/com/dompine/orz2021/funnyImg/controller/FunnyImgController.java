package com.dompine.orz2021.funnyImg.controller;


import com.dompine.orz2021.funnyImg.entity.FunnyImg;
import com.dompine.orz2021.funnyImg.service.IFunnyImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dompine
 * @since 2021-02-12
 */
@RestController
@RequestMapping("/funnyImg/funny-img")
public class FunnyImgController {

    @Autowired
    private IFunnyImgService iFunnyImgService;

    @RequestMapping(value = "gettodayimg")
    @ResponseBody
    List<FunnyImg> getTodayImg(){
        return iFunnyImgService.getTodayImg();
    }

    @RequestMapping(value = "save")
    @ResponseBody
    boolean save(String imgPath){
        FunnyImg funnyImg = new FunnyImg();
        funnyImg.setImgPath(imgPath);
        funnyImg.setCreatedTime(System.currentTimeMillis());
        return iFunnyImgService.save(funnyImg);
    }
}

