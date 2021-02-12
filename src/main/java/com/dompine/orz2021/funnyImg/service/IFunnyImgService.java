package com.dompine.orz2021.funnyImg.service;

import com.dompine.orz2021.funnyImg.entity.FunnyImg;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dompine
 * @since 2021-02-12
 */
public interface IFunnyImgService extends IService<FunnyImg> {

    List<FunnyImg> getTodayImg();


}
