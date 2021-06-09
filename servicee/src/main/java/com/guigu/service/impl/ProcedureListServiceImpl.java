package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ProcedureListMapper;
import com.guigu.pojo.ProcedureList;
import com.guigu.service.ProcedureListService;
import org.springframework.stereotype.Service;

@Service
public class ProcedureListServiceImpl extends ServiceImpl<ProcedureListMapper, ProcedureList> implements ProcedureListService {
}
