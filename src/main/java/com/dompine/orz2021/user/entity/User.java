package com.dompine.orz2021.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author dompine
 * @since 2021-02-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private Integer sendTimes;

    private String avatarUrl;

    private String formId;

    private Integer gender;

    private Integer hasNew;

    private String nickName;

    private String userOpenid;


}
