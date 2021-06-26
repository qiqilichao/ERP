package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Gather;
import com.guigu.pojo.Pay;
import com.guigu.service.DfileService;
import com.guigu.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shijianghua
 * @date 2021/6/23.
 */
@RestController
@RequestMapping("pay")
@CrossOrigin
public class PayController {
    @Autowired
    PayService payService;

    @Autowired
    DfileService dfileService;

    //查询所有出库调度数据
    @RequestMapping("/payselect.action")
    public IPage<Pay>  payselect(@RequestParam(value = "pageno",defaultValue = "1") Integer pageno,
                                 @RequestParam(value = "pagesize",defaultValue = "10")Integer pagesize){
        QueryWrapper<Pay> gatherQueryWrapper = new QueryWrapper<>();
        gatherQueryWrapper.eq("CHECK_TAG","S001-1");
        IPage<Pay> page = payService.page(new Page<Pay>(pageno, pagesize), gatherQueryWrapper);
        return page;
    }

    //根据物料id查寻是否配置安全库存
    @RequestMapping("queryBydfilepid")
    public boolean queryBydfilepid(String productId){
        QueryWrapper<Dfile> wrapper = new QueryWrapper<>();
        wrapper.eq("PRODUCT_ID",productId);
        wrapper.eq("DESIGN_CELL_TAG","K001-1");
        Dfile one = dfileService.getOne(wrapper);
        if(one!=null)
            return true;
        return false;
    }
}
