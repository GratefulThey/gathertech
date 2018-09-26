package com.springmvc.model;

public class Customers {
    private Integer xh;

    private String xm;

    private Integer hyjb;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public Integer getHyjb() {
        return hyjb;
    }

    public void setHyjb(Integer hyjb) {
        this.hyjb = hyjb;
    }
}