package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DesignProcedureModuleMapper;
import com.guigu.pojo.DesignProcedureModule;
import com.guigu.service.DesignProcedureModuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignProcedureModuleServiceimpl extends ServiceImpl<DesignProcedureModuleMapper, DesignProcedureModule>
        implements DesignProcedureModuleService {
    @Override
    public List<DesignProcedureModule> queryByid(int id) {
        QueryWrapper<DesignProcedureModule> wrapper = new QueryWrapper<>();
        wrapper.eq("PARENT_ID",id);
        return this.list(wrapper);
    }
}
