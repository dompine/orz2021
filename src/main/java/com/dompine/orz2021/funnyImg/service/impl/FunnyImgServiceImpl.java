package com.dompine.orz2021.funnyImg.service.impl;

import com.dompine.orz2021.funnyImg.entity.FunnyImg;
import com.dompine.orz2021.funnyImg.mapper.FunnyImgMapper;
import com.dompine.orz2021.funnyImg.service.IFunnyImgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dompine.orz2021.util.DayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dompine
 * @since 2021-02-12
 */
@Service()
@Primary
public class FunnyImgServiceImpl extends ServiceImpl<FunnyImgMapper, FunnyImg> implements IFunnyImgService {

    @Autowired
    private FunnyImgMapper funnyImgMapper;

    @Override
    public List<FunnyImg> getTodayImg() {

        return funnyImgMapper.searchAllByCreatedTimeBetween(DayUtil.getTodayZeroPointTimeStamps(),DayUtil.getTomorrowZeroPointTimeStamps());
    }
}
