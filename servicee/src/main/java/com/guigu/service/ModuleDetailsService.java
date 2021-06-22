package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Module;
import com.guigu.pojo.ModuleDetails;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
public interface ModuleDetailsService extends IService<ModuleDetails> {

    public boolean gobuy(List<ModuleDetails> moduleDetails);
}
