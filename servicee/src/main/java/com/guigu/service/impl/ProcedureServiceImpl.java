package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ProcedureMapper;
import com.guigu.pojo.Procedure;
import com.guigu.service.ProcedureService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public class ProcedureServiceImpl extends ServiceImpl<ProcedureMapper, Procedure> implements ProcedureService {
}
