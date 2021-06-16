package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ConfigFileKindMapper;
import com.guigu.pojo.ConfigFileKind;
import com.guigu.service.ConfigFileKindService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigFileKindServiceImpl extends ServiceImpl<ConfigFileKindMapper, ConfigFileKind> implements ConfigFileKindService {


    @Override
    public List<ConfigFileKind> querAll() {
        QueryWrapper<ConfigFileKind> wrapper1 = new QueryWrapper<ConfigFileKind>();
        wrapper1.eq("P_ID",0);
        List<ConfigFileKind> list = this.list(wrapper1);
        for (ConfigFileKind c1 : list){
            QueryWrapper<ConfigFileKind> wrapper2 = new QueryWrapper<ConfigFileKind>();
            wrapper2.eq("P_ID",c1.getId());
            List<ConfigFileKind> list1 = this.list(wrapper2);
            c1.setConfigFileKinds(list1);
            for (ConfigFileKind c2 : list1){
                QueryWrapper<ConfigFileKind> wrapper3 = new QueryWrapper<ConfigFileKind>();
                wrapper3.eq("P_ID",c2.getId());
                List<ConfigFileKind> list2 = this.list(wrapper3);
                c2.setConfigFileKinds(list2);
            }
        }
        return list;
    }
}
