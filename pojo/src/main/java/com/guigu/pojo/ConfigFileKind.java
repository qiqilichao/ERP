package com.guigu.pojo;

public class ConfigFileKind {
    private Integer id;

    private Integer pId;

    private String kindId;

    private String kindName;

    private Integer kindLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId == null ? null : kindId.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public Integer getKindLevel() {
        return kindLevel;
    }

    public void setKindLevel(Integer kindLevel) {
        this.kindLevel = kindLevel;
    }
}
