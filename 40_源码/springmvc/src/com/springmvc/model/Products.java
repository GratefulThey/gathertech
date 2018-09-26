package com.springmvc.model;

public class Products {
    private Integer xh;

    private String mc;

    private Long jg;

    private Integer dj;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    public Long getJg() {
        return jg;
    }

    public void setJg(Long jg) {
        this.jg = jg;
    }

    public Integer getDj() {
        return dj;
    }

    public void setDj(Integer dj) {
        this.dj = dj;
    }
}