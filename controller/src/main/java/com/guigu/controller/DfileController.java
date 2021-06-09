package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Dfile;
import com.guigu.service.DfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/8.
 */
@RestController
@CrossOrigin
public class DfileController {

    @Autowired
    DfileService dfileService;

    //查询出所有通过审核的产品档案的商品
    @RequestMapping("cpshenghetg.action")
    public IPage<Dfile> cpshenghetg(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                    @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                    Dfile dfile){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        queryWrapper.eq("type","Y001-1");
        queryWrapper.eq("CHECK_TAG","S001-1");
        queryWrapper.eq("DESIGN_MODULE_TAG","W001-0");
        if(!StringUtils.isEmpty(dfile.getFactoryName())){
            queryWrapper.like("factoryName",dfile.getFactoryName());
        }
        IPage<Dfile> page = dfileService.page(new Page<Dfile>(pageno, pagesize), queryWrapper);
        return page;
    }
    //物料组成设计单单个商品查询
    @RequestMapping("shejiselectbyid.action")
    public Dfile shejiselectbyid(int id){
         Dfile byId = dfileService.getById(id);
        return byId;
    }
    //查询所有物料
    @RequestMapping("wuliaoselect.action")
    public List<Dfile> wuliaoselect(){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        queryWrapper.eq("type","Y001-2");
        List<Dfile> list = dfileService.list(queryWrapper);
        System.out.println(list);
        return list;
    }
}
