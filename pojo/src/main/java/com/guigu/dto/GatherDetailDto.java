package com.guigu.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author shijianghua
 * @date 2021/6/25.
 */
@Data
public class GatherDetailDto {
    @TableField(exist = false)
    private String gatherId;
    @TableField(exist = false)
    private String register;
}
