package com.guigu.util;

import java.util.List;

public class PageUtil<T> {

    private long total;

    private List<T> rows;  //前端框架 会从rows变量拿数据  循环 展示

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
