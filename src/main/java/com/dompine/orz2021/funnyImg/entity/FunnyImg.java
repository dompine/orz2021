package com.dompine.orz2021.funnyImg.entity;

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
 * @since 2021-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FunnyImg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "funny_img_id", type = IdType.AUTO)
    private Long funnyImgId;

    private Long createdTime;

    private String imgPath;

    private Integer oo = 0;

    private Integer xx = 0;


}
