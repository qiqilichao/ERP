package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ProcedureModuleMapper;
import com.guigu.pojo.ProcedureModule;
import com.guigu.service.ProcedureModuleService;
import org.springframework.stereotype.Service;

@Service
public class ProcedureModuleServiceImpl extends ServiceImpl<ProcedureModuleMapper, ProcedureModule>
        implements ProcedureModuleService {
}
