package com.guigu.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("d_config_file_kind")
public class ConfigFileKind {
    private Integer id;

    private Integer pId;

    private String kindId;

    private String kindName;

    private Integer kindLevel;

    @TableField(exist = false)
    public List<ConfigFileKind> configFileKinds;
}
