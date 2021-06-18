package com.guigu.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.dto.ApplyDto;
import com.guigu.mapper.ApplyMapper;
import com.guigu.pojo.Apply;
import com.guigu.pojo.Dfile;
import com.guigu.service.ApplyService;
import com.guigu.service.DfileService;
import com.guigu.util.IdUtil;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.APOptions;

import javax.rmi.CORBA.Util;
import javax.swing.event.ListDataEvent;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ApplyServiceImpl extends ServiceImpl<ApplyMapper,Apply> implements ApplyService {

    @Autowired
    private DfileService dfileService;

    @Autowired
    public ApplyMapper applyMapper;

    //查询所有Dfile
    public IPage<Dfile> pageDfile(int pageno , int pasize, Dfile dfile){

        QueryWrapper<Dfile> wrapper =new QueryWrapper();
        wrapper.eq("TYPE","Y001-1");
        wrapper.eq("CHECK_TAG","S001-1");
       /* wrapper.eq("DESIGN_MODULE_TAG","W001-1");
        wrapper.eq("DESIGN_PROCEDURE_TAG","G001-1");
        wrapper.eq("DESIGN_CELL_TAG","K001-1");*/
       if(!StringUtils.isEmpty(dfile.getProductName())){
           wrapper.like("PRODUCT_NAME",dfile.getProductName());
       }
        return dfileService.page(new Page<Dfile>(pageno,pasize),wrapper);
    }

    //查询生产计划表
    @Override
    public IPage<Apply> pageApply(int pageno, int pagesize, Apply apply) {

        QueryWrapper<Apply> wrapper= new QueryWrapper();
        wrapper.eq("CHECK_TAG","S001-0");
        return this.page(new Page<Apply>(pageno,pagesize),wrapper);
    }

    @Override
    //查询所有Apply
    public IPage<Apply> pageApplyAll(int pageno, int pagesize, Apply apply) {

        QueryWrapper<Apply> wrapper= new QueryWrapper();
        if(!StringUtils.isEmpty(apply.getProductName())){
            wrapper.like("PRODUCT_NAME",apply.getProductName());
        }
        if(apply.getRegisterTime()!=null){
            wrapper.ge("REGISTER_TIME",apply.getRegisterTime());
        }
        if(apply.getRegisterTime2()!=null){
            wrapper.le("REGISTER_TIME",apply.getRegisterTime2());
        }

        if(!"-1".equals(apply.getCheckTag())){
             wrapper.eq("CHECK_TAG",apply.getCheckTag());
        }

        return this.page(new Page<Apply>(pageno,pagesize),wrapper);
    }

    //生产调动
    @Override
    public List<Apply> formulatelist(Apply apply) {

        QueryWrapper<Apply> wrapper = new QueryWrapper<>();
         wrapper.eq("CHECK_TAG","S001-1");
         wrapper.eq("MANUFACTURE_TAG","P001-0");
         if(!StringUtils.isEmpty(apply.getProductId())){
             wrapper.eq("PRODUCT_ID",apply.getProductId());
         }
         if(!StringUtils.isEmpty(apply.getProductName())){
             wrapper.like("PRODUCT_NAME",apply.getProductName());
         }
        return this.list(wrapper);
    }


    //添加
    @Override
    public boolean addApply(List<Dfile> dfilelies) {

        //添加新的apply数据
        List<Apply> applies= new ArrayList<>();

        List<Apply> list = this.list();

       int  index =1;
       if(list.size()>0){
           Apply apply1= list.get(list.size()-1);
           String applyId = apply1.getApplyId();
           String str= applyId.substring(applyId.length()-4);
           index=Integer.parseInt(str)+1;
       }/*else if(list.size()>0){
              index=list.size()+1;
       }*/

         for (Dfile d : dfilelies) {

             Apply apply= new Apply();

             if(applies.size()==0){
                 //一次新的开始
                 apply.setApplyId(IdUtil.ApplyId(index));
             }else {
                 Apply apply1= applies.get(applies.size()-1);
                 String applyId = apply1.getApplyId();
                 apply.setApplyId(IdUtil.ApplyId(1+Integer.parseInt( applyId.substring(applyId.length()-4))) );
             }

             apply.setProductId(d.getProductId());
             apply.setProductName(d.getProductName());
             apply.setAmount(Float.valueOf(d.getNum()));
             apply.setRegisterTime(d.getRegisterTime2());
             apply.setRegister(d.getRegister());
             apply.setRemark(d.getRemark());
             apply.setCheckTag("S001-0");
             apply.setManufactureTag("P001-0");

             applies.add(apply);
            }



        return this. saveBatch(applies);
    }

    @Override
    public boolean updateCHECKER(Apply apply) {
        int i = applyMapper.updateChecktag(apply);
        if(i>0)
            return true;
        return false;
    }


}
