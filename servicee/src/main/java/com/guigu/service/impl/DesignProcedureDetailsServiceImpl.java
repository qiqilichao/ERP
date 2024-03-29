package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DesignProcedureDetailsMapper;
import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.service.DesignProcedureDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignProcedureDetailsServiceImpl extends ServiceImpl<DesignProcedureDetailsMapper, DesignProcedureDetails>
        implements DesignProcedureDetailsService {

        @Autowired
        private DesignProcedureDetailsMapper designProcedureDetailsMapper;

    @Override
    public List<DesignProcedureDetails> seldisproById(Integer id) {
        QueryWrapper<DesignProcedureDetails> wrapper = new QueryWrapper<DesignProcedureDetails>();
        wrapper.eq("PARENT_ID",id);
        return this.list(wrapper);
    }

    @Override
    public List<DesignProcedureDetails> queryWrapper(String id) {

        return designProcedureDetailsMapper.seletWrapper(id);
    }

    @Override
    public List<DesignProcedureDetails> listBypid(String productId) {
        return  designProcedureDetailsMapper.selectByproduct_id(productId);
    }
}
