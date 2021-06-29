package com.guigu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Scell;
import com.guigu.service.ScellService;
import com.guigu.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Scell")
@CrossOrigin
public class ScellController {
    @Autowired
    ScellService scellService;
    /**
     * 添加
     * @param scell
     * @return
     */
    @RequestMapping("/addScll.May")
    public boolean addScll(Scell scell){
        System.out.println(scell);
        return scellService.addSCll(scell);
    }

    /**
     * 复核总数据查询
     * @return
     */
    @RequestMapping("/queryAllScell.May")

    public PageInfo<Dfile> queryAllSCll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                        @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                        Dfile dfile){
        PageInfo<Dfile> scellPageInfo = scellService.queryAllSCll(pageno,pagesize,dfile,"S001-0", "S001-2");
        scellPageInfo.setTotal(scellPageInfo.getTotal());
        scellPageInfo.setList(scellPageInfo.getList());
        return scellPageInfo;
    }



    /**
     * 查询复核的数据
     * @param productId
     * @return
     */
    @RequestMapping("/queryByIdSCell.May")
    public Scell queryByIdSCell(String productId){
        System.out.println("queryByIdDFile的productId"+productId);
        return scellService.queryByIdScell(productId);
    }


    /**
     * 查询复核表格数据
     * @param productId
     * @return
     */
    @RequestMapping("/queryByIdSCell2.May")
    public List<Scell> queryByIdSCell2(String productId){
        System.out.println("queryByIdDFile2的productId"+productId);
        return scellService.queryByIdScell2(productId);
    }


    /**
     * 复核
     * @param id
     * @param CheckTag
     * @return
     */
    @RequestMapping("/amendCheckTag.May")
    public boolean amendCheckTag(int id,String CheckTag){
        return scellService.amendCheckTag(id,CheckTag);
    }


    /**
     * 查询总数据查询
     * @return
     */
    @RequestMapping("/queryAllSCell2.May")

    public PageUtil<Dfile> queryAllSCell2(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                          @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                          Dfile dFile){
        PageInfo<Dfile> sCellPageInfo = scellService.queryAllSCll(pageno,pagesize,dFile,"S001-1", "S001-2");
        PageUtil<Dfile> pageUtil =new PageUtil<Dfile>();
        pageUtil.setTotal(sCellPageInfo.getTotal());
        pageUtil.setRows(sCellPageInfo.getList());
        return pageUtil;
    }



    /**
     * 修改
     * @param scell
     * @return
     */
    @RequestMapping("/amendSCll.May")
    public boolean amendSCll(Scell scell){
        return scellService.amendSCll(scell);
    }


    /**
     * 分页动态库存查询
     */
    @RequestMapping("/pageScell")
    public IPage<Scell> pageScell(@RequestParam(defaultValue = "1") int pageno,
                                  @RequestParam(defaultValue = "10") int pagesize,
                                  Scell scell){
        System.out.println(scell);
        return scellService.pageScell(pageno,pagesize,scell);
    }







}
