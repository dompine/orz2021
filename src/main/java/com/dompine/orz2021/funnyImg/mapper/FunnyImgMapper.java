package com.dompine.orz2021.funnyImg.mapper;

import com.dompine.orz2021.funnyImg.entity.FunnyImg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dompine
 * @since 2021-02-12
 */
public interface FunnyImgMapper extends BaseMapper<FunnyImg> {

    List<FunnyImg> searchAllByCreatedTimeBetween(Long t1,Long t2);

    @Override
    int insert(FunnyImg entity);
}
