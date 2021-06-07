package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DfileMapper;
import com.guigu.pojo.Dfile;
import com.guigu.service.DfileService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DfileServiceImpl extends ServiceImpl<DfileMapper, Dfile> implements DfileService {
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
}
