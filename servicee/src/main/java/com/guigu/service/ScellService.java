package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Scell;

import java.util.List;

public interface ScellService extends IService<Scell> {
    /**
     * 添加
     * @param scell
     * @return
     */
    boolean addSCll(Scell scell);
    /**
     * 复核-总数据查询
     * @return
     */
   PageInfo<Dfile> queryAllSCll(int pageNo, int pageSize, Dfile dfile, String tag, String tag2);
    /**
     *查询安全库存配置单-复核的数据
     * @param id
     * @return
     */
    Scell queryByIdScell(String id);
    /**
     *查询安全库存配置单中的-复核表格数据
     * @param id
     * @return
     */
    List<Scell> queryByIdScell2(String id);
    /**
     * 复核
     * @param id,CheckTag
     * @return
     */
    boolean amendCheckTag(int id, String CheckTag);
    /**
     * 修改
     * @param scell
     * @return
     */
    public boolean amendScell(Scell scell);

    boolean amendSCll(Scell scell);

    List<Scell> queryByIdSCell2(String productId);


}
