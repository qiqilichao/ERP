package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DfileMapper;
import com.guigu.pojo.Dfile;
import com.guigu.service.DfileService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class DfileServiceImpl extends ServiceImpl<DfileMapper,Dfile> implements DfileService {
    @Autowired
    DfileMapper dfileMapper;

    @Override
    public boolean insDfile(Dfile dfile) {
        IdUtil idUtil = new IdUtil();
        List<Dfile> list = this.list();
        if (list.size()==0){
            dfile.setProductId("100"+dfile.getFirstKindId()+dfile.getSecondKindId()+dfile.getThirdKindId()+"000001");
        }else{
            dfile.setProductId("100"+dfile.getFirstKindId()+dfile.getSecondKindId()+dfile.getThirdKindId()+idUtil.ProductId(list.get(list.size()-1)));
        }
        return false;
    }

    @Override
     //查询产品是否完成所有设计
    public boolean quertyBypid(String productId) {
         QueryWrapper<Dfile> wrapper = new QueryWrapper<Dfile>();
         wrapper.eq("DESIGN_MODULE_TAG","W001-1");
         wrapper.eq("DESIGN_PROCEDURE_TAG","G001-1");
         wrapper.eq("PRODUCT_ID",productId);
         Dfile one = this.getOne(wrapper);
         if(one!=null)
             return true;
        return false;
    }


    /**
     * 根据复核状态查询生产工序设计单数据
     * 状态：
     * S001-0: 等待审核
     * S001-1: 审核通过
     * S001-2: 审核不通过
     * @param state
     * @return
     */
    List<Dfile> queryByState(String state){
        return queryByState(state);
    }
    /**
     *查询安全库存配置单表格数据
     * @param pageno
     * @param pagesize
     * @param dfile
     * @return
     */

    public IPage<Dfile> queryAllDfile(int pageno, int pagesize, Dfile dfile){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("CHECK_TAG","S001-1");
//        hhy
        if(!StringUtils.isEmpty(dfile.getProductName())){
            queryWrapper.like("name",dfile.getProductName());
        }
        return this.page(new Page<Dfile>(pageno,pagesize), queryWrapper);
    }

    @Override
    public List<Dfile> queryByDfile2(String productId) {
        System.out.println("queryByIdDFile2的productId"+productId);
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PRODUCT_ID",productId);
        return  this.list(queryWrapper);
    }


    /**
     *查询安全库存配置单的数据
     * @param productId
     * @return
     */
    Dfile queeryByIdDfile(String productId){
        System.out.println("queryByIdDFile1的productId"+productId);
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PRODUCT_ID",productId);
        return  this.getOne(queryWrapper);
    }


    /**
     *查询安全库存配置单中的表格数据
     * @param productId
     * @return
     */
    List<Dfile> queryByIdDfile2(String productId){
        System.out.println("queryByIdDFile2的productId"+productId);
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PRODUCT_ID",productId);
        return  this.list(queryWrapper);
    }

}
