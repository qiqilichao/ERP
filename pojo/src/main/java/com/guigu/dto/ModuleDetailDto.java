package com.guigu.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author shijianghua
 * @date 2021/6/22.
 */
@Data
public class ModuleDetailDto {
    @TableField(exist = false)
    private Integer mdid;
}
