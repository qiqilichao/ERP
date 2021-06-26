package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.Cell;
import com.guigu.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Cell> cellproductId(String productId){
        QueryWrapper<Cell> cellQueryWrapper = new QueryWrapper<>();
        cellQueryWrapper.eq("PRODUCT_ID",productId);
      /*  Cell one = cellService.getOne(cellQueryWrapper);*/
         List<Cell> list = cellService.list(cellQueryWrapper);
        System.out.println(list);
        return list;
    }
    @RequestMapping("/cellprodu.action")
    public String cellprodu(){
        //System.out.println(324567890);
        return " ";
    }
    @RequestMapping("/dqcunchuUpdateById.action")
    public boolean dqcunchuUpdateById(@RequestBody List<Cell> cell){
        for(Cell cell1 :cell){
            Integer id = cell1.getId();
            Cell byId = cellService.getById(id);
            System.out.println(byId.getAmount());
            System.out.println(cell1.getRukushu());
            float v = byId.getAmount() + cell1.getRukushu();
            System.out.println(v);
            byId.setAmount(v);
            boolean b = cellService.updateById(byId);
        }

        return true;
    }
}
