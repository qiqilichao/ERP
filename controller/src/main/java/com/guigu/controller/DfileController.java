package com.guigu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Dfile;
import com.guigu.service.DfileService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dfile")
@CrossOrigin
public class DfileController {
    @Autowired
    DfileService dfileService;

    @RequestMapping("/add.action")
    public boolean add(Dfile dfile) {
        IdUtil idUtil = new IdUtil();
        List<Dfile> list = dfileService.list();
        String productId = idUtil.ProductId(list.get(list.size() - 1));
        dfile.setProductId(productId);
        String kindName = dfile.getFirstKindName();
        if (kindName.equals("电子")) {
            dfile.setFirstKindId("01");
        }
        String kindName1 = dfile.getSecondKindName();
        if (kindName1.equals("计算机")) {
            dfile.setSecondKindId("01");
        }
        String kindName2 = dfile.getThirdKindName();
        if (kindName2.equals("服务器")) {
            dfile.setThirdKindId("01");
        }
        String type = dfile.getType();
        if (type.equals("商品")) {
            dfile.setType("Y001-1");
        }
        if (type.equals("物料")) {
            dfile.setType("Y001-2");
        }
        String aClass = dfile.getProductClass();
        if (aClass.equals("高档") || aClass.equals("中档") || aClass.equals("低档")) {
            dfile.setProductClass("D001-1");
        }
        dfile.setCheckTag("S001-0");
        dfile.setDeleteTag("C001-0");
        dfile.setDesignModuleTag("W001-0");
        dfile.setDesignProcedureTag("G001-0");
        dfile.setDesignCellTag("K001-0");
        String pId = "100"+dfile.getFirstKindId()+dfile.getSecondKindId()+dfile.getThirdKindId()+idUtil.ProductId(list.get(list.size() - 1));
        dfile.setProductId(pId);
        return dfileService.save(dfile);
    }
    @RequestMapping("/cpshenghetg.action")
    public IPage<Dfile> queryallcartype(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                        @RequestParam(value = "pagesize", defaultValue = "10") int pagesize,
                                        Dfile dfile) {

        //组装查询条件
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        queryWrapper.eq("type", "Y001-1");
        queryWrapper.eq("CHECK_TAG", "S001-1");
        queryWrapper.eq("DESIGN_MODULE_TAG", "W001-0");

        return dfileService.page(new Page<Dfile>(pageno, pagesize), queryWrapper);

    }
    @RequestMapping("/shejiselectbyid.action")
    public Dfile shejiselectbyid(int id){
         Dfile byId = dfileService.getById(id);
         return byId;
    }
    @RequestMapping("/wuliaoselect.action")
    public List<Dfile> wuliaoselect(){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        queryWrapper.eq("type", "Y001-2");
        queryWrapper.eq("CHECK_TAG", "S001-1");
       List<Dfile> list = dfileService.list(queryWrapper);
       return list;
    }


    @RequestMapping("quertyBypid")
    @ResponseBody
    //wq查询产品是否完成所有设计
    public boolean quertyBypid(String productId){
        System.out.println(productId);
        return dfileService.quertyBypid(productId);
    }
    //根据未审核查询数据
    @RequestMapping("/fileShenhe.action")
    public IPage<Dfile> fileShenhe(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                   @RequestParam(value = "pagesize", defaultValue = "5") int pagesize,
                                   Dfile dfile){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        queryWrapper.eq("CHECK_TAG", "S001-0");

        return dfileService.page(new Page<Dfile>(pageno, pagesize), queryWrapper);
    }
    //根据审核通过查询数据
    @RequestMapping("/approved.action")
    public IPage<Dfile> approved(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                   @RequestParam(value = "pagesize", defaultValue = "5") int pagesize,
                                   Dfile dfile){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        if(!StringUtils.isEmpty(dfile.getProductName())){
            queryWrapper.like("PRODUCT_NAME",dfile.getProductName());
        }
        queryWrapper.eq("CHECK_TAG", "S001-1");

        return dfileService.page(new Page<Dfile>(pageno, pagesize), queryWrapper);
    }
    //审核通过
    @RequestMapping("/through.action")
    public boolean through(Dfile dfile){
        System.out.println(dfile);
        dfile.setCheckTag("S001-1");
        boolean b = dfileService.updateById(dfile);
        return b;
    }
    //不审核通过
    @RequestMapping("/notthrough.action")
    public boolean notthrough(Dfile dfile){
        System.out.println(dfile);
        dfile.setCheckTag("S001-2");
        boolean b = dfileService.updateById(dfile);
        return b;
    }
    //修改数据
    @RequestMapping("/modifythe.action")
    public boolean modifythe(Dfile dfile){
        System.out.println(dfile);
        dfile.setCheckTag("S001-0");
        boolean b = dfileService.updateById(dfile);
        return b;
    }
    //删除数据（未删除）
    @RequestMapping("/modifydel.action")
    public boolean modifydel(Dfile dfile){

        dfile.setDeleteTag("C001-1");
        dfile.setCheckTag("S001-0");
        boolean updateById = dfileService.updateById(dfile);
        return updateById;
    }
    //审核已删除的数据
    @RequestMapping("/approveddel.action")
    public IPage<Dfile> approveddel(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                 @RequestParam(value = "pagesize", defaultValue = "5") int pagesize,
                                 Dfile dfile){
        QueryWrapper<Dfile> queryWrapper = new QueryWrapper<Dfile>();
        if(!StringUtils.isEmpty(dfile.getProductName())){
            queryWrapper.like("PRODUCT_NAME",dfile.getProductName());
        }
        queryWrapper.eq("CHECK_TAG", "S001-0");
        queryWrapper.eq("DELETE_TAG","C001-1");

        return dfileService.page(new Page<Dfile>(pageno, pagesize), queryWrapper);
    }
    //恢复删除数据（已删除）
    @RequestMapping("/recoverdeleted.action")
    public boolean recoverdeleted(Dfile dfile){

        dfile.setDeleteTag("C001-0");
        boolean updateById = dfileService.updateById(dfile);
        return updateById;
    }
    //产品档案永久删除
    @RequestMapping("/permanentlydelete.action")
    public boolean permanentlydelete(int id){
        return dfileService.removeById(id);
    }
    /**cmf
     * 查询单表格数据
     * @param pageno
     * @param pagesize
     * @return
     */
    @RequestMapping("/queryAllDFile.action")
    public IPage<Dfile> queryAllDFile(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "10") int pagesize){

        System.out.println(1213);
        /*dfileService.queryAllDfile(pageno,pagesize,dfile);*/
        IPage<Dfile> page = dfileService.page(new Page<Dfile>(pageno, pagesize));
        System.out.println(page);
        return page;
    }


    /**cmf
     * 查询安全库存配置单的数据
     * @param productId
     * @return
     */
   @RequestMapping("/queryByIdDFile.May")
    public List<Dfile> queryByIdDFile(String productId){
        System.out.println("queryByIdDFile的productId"+productId);
        return dfileService.queryByDfile2(productId);
    }


    /**cmf
     * 查询表格数据
     * @param productId
     * @return
     */
    @RequestMapping("/queryByIdDFile2.May")
    public List<Dfile> queryByIdDFile2(String productId){
        System.out.println("queryByIdDFile2的productId"+productId);
        return dfileService.queryByDfile2(productId);
    }
}
