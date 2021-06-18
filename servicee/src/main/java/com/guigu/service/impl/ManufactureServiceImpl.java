package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ManufactureMapper;
import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.pojo.Manufacture;
import com.guigu.pojo.Procedure;
import com.guigu.pojo.ProcedureModule;
import com.guigu.service.DesignProcedureDetailsService;
import com.guigu.service.ManufactureService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManufactureServiceImpl extends ServiceImpl<ManufactureMapper,Manufacture>
        implements ManufactureService {

    @Autowired
    private DesignProcedureDetailsService designProcedureDetailsService;

    @Override
    public boolean addManufacture(Manufacture manufacture) {


        List<Manufacture> list = this.list();
        if(list.size()==0){
            manufacture.setManufactureId(IdUtil.manufactureId(null));
        }else{
            manufacture.setManufactureId(IdUtil.manufactureId(list.get(list.size()-1)));
        }

               manufacture.setCheckTag("S001-0");
               manufacture.setManufactureProcedureTag("S002-0");


               //添加生产工序物料
        List<DesignProcedureDetails> details = designProcedureDetailsService.listBypid(manufacture.getProductId());

        List<Procedure> procedureArrayList = new ArrayList<Procedure>();
        for (DesignProcedureDetails d: details){

            Procedure procedure = new Procedure();

            procedure.setParentId(manufacture.getId());

            procedure.setDetailsNumber(d.getDetailsNumber());
            procedure.setProcedureId(d.getProcedureId());
            procedure.setProcedureName(d.getProcedureName());
            procedure.setLabourHourAmount(d.getLabourHourAmount());

            procedure.setRealLabourHourAmount(0);
            procedure.setSubtotal(d.getSubtotal());
            procedure.setRealSubtotal(0);
            procedure.setModuleSubtotal(d.getModuleSubtotal());
            procedure.setRealModuleSubtotal(0);
            procedure.setCostPrice(d.getCostPrice());
            procedure.setDemandAmount (manufacture.getAmount());

            procedure.setRealAmount(0);

            procedure.setProcedureFinishTag("G004-0");
            procedure.setProcedureTransferTag("G005-0");

            procedureArrayList.add(procedure);

        }
        //this.save(manufacture);
        return false;
    }
}
