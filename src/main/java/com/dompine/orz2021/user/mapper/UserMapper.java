package com.dompine.orz2021.user.mapper;

import com.dompine.orz2021.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Optional;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dompine
 * @since 2021-02-11
 */
public interface UserMapper extends BaseMapper<User> {

        Optional<User> searchByUserOpenid(String userOpenid);
}
