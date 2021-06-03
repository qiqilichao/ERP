package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.MenuMapper;
import com.guigu.pojo.Menu;
import com.guigu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> queryAllMenus() {
        QueryWrapper<Menu> wrapper1 = new QueryWrapper<Menu>();
        wrapper1.eq("PARENT_ID",0);

        List<Menu> menus = this.list(wrapper1);

        for (Menu m : menus) {
            QueryWrapper<Menu> wrapper2 = new QueryWrapper<Menu>();
            wrapper2.eq("PARENT_ID",m.getId());
            List<Menu> list = this.list(wrapper2);
            m.setChildMenu(list);
            for(Menu m2 : m.getChildMenu()){
                QueryWrapper<Menu> wrapper3 = new QueryWrapper<Menu>();
                wrapper3.eq("PARENT_ID",m2.getId());
                List<Menu> list1 = this.list(wrapper3);
                m2.setChildMenu(list1);
                for (Menu m3 : m2.getChildMenu()){
                    QueryWrapper<Menu> wrapper4 = new QueryWrapper<Menu>();
                    wrapper4.eq("PARENT_ID",m3.getId());
                    List<Menu> list2 = this.list(wrapper4);
                    m3.setChildMenu(list2);
                }
            }
        }
        return menus;
    }
}
