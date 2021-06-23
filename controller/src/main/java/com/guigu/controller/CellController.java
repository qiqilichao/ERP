package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.Cell;
import com.guigu.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shijianghua
 * @date 2021/6/23.
 */
@RestController
@RequestMapping("cell")
@CrossOrigin
public class CellController {
    @Autowired
    CellService cellService;
    //根据产品编号查询
    @RequestMapping("/cellproductId.action")
    public Cell cellproductId(String productId){
        QueryWrapper<Cell> cellQueryWrapper = new QueryWrapper<>();
        cellQueryWrapper.eq("PRODUCT_ID",productId);
        Cell one = cellService.getOne(cellQueryWrapper);
        return one;
    }
}
