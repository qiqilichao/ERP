package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DesignProcedureMapper;
import com.guigu.mapper.DfileMapper;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.pojo.Module;
import com.guigu.pojo.ProcedureList;
import com.guigu.service.DesignProcedureDetailsService;
import com.guigu.service.DesignProcedureService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DesignProcedureServiceImpl extends ServiceImpl<DesignProcedureMapper, DesignProcedure> implements DesignProcedureService {
    @Autowired
    DesignProcedureDetailsService designProcedureDetailsService;

    @Autowired
    DfileMapper dfileMapper;

    @Override
    public boolean insdesignProceduure(List<ProcedureList> procedureLists) {
        DesignProcedure updstu = procedureLists.get(0).getUpdstu();
        List<DesignProcedure> list = this.list();
        if (list.size()>0){
            updstu.setDesignId(new IdUtil().DesignProcedureId(list.get(list.size()-1)));
        }else{
            Date dt=new Date();
            SimpleDateFormat matter1=new SimpleDateFormat("yyyyMMdd");
            String date =  matter1.format(dt);
            updstu.setDesignId("201"+date+"0001");
        }
        boolean disprosave = this.save(updstu);
        List<DesignProcedureDetails> dpd = new ArrayList<DesignProcedureDetails>();
        if (disprosave){
            dfileMapper.upddfilegx(updstu.getProductId());
            int index=1;
            for (ProcedureList p : procedureLists){
                DesignProcedureDetails details = new DesignProcedureDetails();
                details.setParentId(updstu.getId());
                details.setDetailsNumber(index);
                index++;
                details.setProcedureId(p.getTypeId());
                details.setProcedureName(p.getTypeName());
                details.setLabourHourAmount(p.getLabourHourAmount());
                details.setAmountUnit(p.getAmountUnit());
                details.setCostPrice(p.getCostPrice());
                details.setSubtotal(p.getSubtotal());
                details.setRegister(updstu.getRegister1());
                details.setRegisterTime(updstu.getRegisterTime1());
                details.setDesignModuleTag("D002-0");
                details.setDesignModuleChangeTag("D003-0");
                dpd.add(details);
            }
        }
        return designProcedureDetailsService.saveBatch(dpd);
    }

    @Override
    public List<DesignProcedure> seltoiexmal() {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        wrapper.eq("CHECK_TAG","S001-0");
        List<DesignProcedure> list = this.list(wrapper);
        return list;
    }

    @Override
    public boolean toexamine(DesignProcedure designProcedure,Integer radios) {
        //通过
        if (radios==2){
            //设置他的审核状态，修改为通过
            designProcedure.setCheckTag("S001-1");
        }
        //不通过
        return this.updateById(designProcedure);
    }

    @Override
    public IPage<DesignProcedure> listAll(Integer pageno, Integer pagesize, DesignProcedure designProcedure) {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        if (designProcedure.getFirstKindId() != null) {
            wrapper.eq("FIRST_KIND_ID", designProcedure.getFirstKindId());
        }
        if (designProcedure.getSecondKindId() != null) {
            wrapper.eq("SECOND_KIND_ID", designProcedure.getSecondKindId());
        }
        if (designProcedure.getThirdKindId() != null) {
            wrapper.eq("THIRD_KIND_ID", designProcedure.getThirdKindId());
        }
        if (designProcedure.getDate1() != null) {
            wrapper.ge("REGISTER_TIME", designProcedure.getDate1());
        }
        if (designProcedure.getDate2() != null) {
            wrapper.le("REGISTER_TIME", designProcedure.getDate2());
        }
        return this.page(new Page<DesignProcedure>(pageno,pagesize),wrapper);
    }
}
