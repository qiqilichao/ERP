package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ModuleDetailsMapper;
import com.guigu.pojo.ModuleDetails;
import com.guigu.service.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
@Service
public class ModuleDetailsServiceImpl extends ServiceImpl<ModuleDetailsMapper, ModuleDetails> implements ModuleDetailsService {
@Autowired
ModuleDetailsService moduleDetailsService;
    @Override
    public boolean gobuy(List<ModuleDetails> moduleDetails) {
        for (ModuleDetails moduleDetails1:moduleDetails){
            moduleDetails1.setParentId(moduleDetails1.getMdid());
            moduleDetails1.setDetailsNumber(moduleDetails1.getId());
            moduleDetailsService.save(moduleDetails1);
        }
        return true;
    }
}
