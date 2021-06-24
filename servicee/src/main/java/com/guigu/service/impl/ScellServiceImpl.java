package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.ScellMapper;
import com.guigu.pojo.Dfile;
import com.guigu.service.ScellService;
import com.guigu.pojo.Scell;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScellServiceImpl extends ServiceImpl<ScellMapper,Scell> implements ScellService{
    @Autowired
    private ScellMapper scellMapper;

    /**
     * 添加
     * @param scell
     * @return
     */
    @Override
    public boolean addSCll(Scell scell) {
        System.out.println(scell);
        IdUtil idUtil = new IdUtil();
        scell.setCheckTag("S001-0");
        return this.save(scell);
      /*  String cellId = idUtil.CellId(sCell);
        sCell.setStoreId(cellId);*/
    }

//    @Override
//    public Scell queryByIdScell(String id) {
//        return null;
//    }

    @Override
    public List<Scell> queryByIdScell2(String id) {
        return null;
    }

//    @Override
//    public boolean amendCheckTag(int id,String CheckTag) {
//        return false;
//    }

    @Override
    public boolean amendScell(Scell scell) {
        return false;
    }
    /**
     * 安全库存配置单-复核-总数据查询
     * @return
     */
   public PageInfo<Dfile> queryAllSCll(int pageNo, int pageSize, Dfile dfile, String tag, String tag2){
        System.out.println("queryAllSCll"+tag+":"+tag2);
        // 设置分页参数
        PageHelper.startPage(pageNo, pageSize);
       List<Dfile> sCells = scellMapper.queryAllSCll(tag,tag2);
        // 封装分页对象
        PageInfo<Dfile> sCellPageInfo = new PageInfo<>(sCells);
        return sCellPageInfo;
    }
    /**
     *查询安全库存配置单-复核的数据
     * @param id
     * @return
     */
    @Override
    public Scell queryByIdScell(String id) {
        System.out.println("queryByIdSCell的productId"+id);
        QueryWrapper<Scell> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PRODUCT_ID",id);
        return  this.getOne(queryWrapper);
    }
    /**
     *查询安全库存配置单中的-复核表格数据
     * @param productId
     * @return
     */
    @Override
    public List<Scell> queryByIdSCell2(String productId) {
        System.out.println("queryByIdSCell2的productId"+productId);
        QueryWrapper<Scell> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("PRODUCT_ID",productId);
        return  this.list(queryWrapper);
    }
    /**
     * 制作安全库存配置单-复核
     * @param id,CheckTag
     * @return
     */
    @Override
    public boolean amendCheckTag(int id, String CheckTag) {
        Scell scell = this.getById(id);
        scell.setCheckTag("S001-1");
        return this.updateById(scell);
    }
    /**
     * 制作安全库存配置单-修改
     * @param scell
     * @return
     */
    @Override
    public boolean amendSCll(Scell scell) {
        System.out.println(scell);
        scell.setCheckTag("S001-2");
        return this.updateById(scell);
    }
}
