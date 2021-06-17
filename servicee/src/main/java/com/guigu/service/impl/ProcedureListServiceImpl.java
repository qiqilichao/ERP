package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DesignProcedureMapper;
import com.guigu.mapper.ProcedureListMapper;
import com.guigu.pojo.ProcedureList;
import com.guigu.service.DesignProcedureDetailsService;
import com.guigu.service.ProcedureListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcedureListServiceImpl extends ServiceImpl<ProcedureListMapper, ProcedureList> implements ProcedureListService {
    @Autowired
    DesignProcedureMapper designProcedureMapper;

    @Autowired
    DesignProcedureDetailsService designProcedureDetailsService;

    @Override
    public boolean delprolist(Integer proid, Integer id) {
        designProcedureMapper.upddestag(id);
        return designProcedureDetailsService.removeById(proid);
    }
}
