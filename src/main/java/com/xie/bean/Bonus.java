package com.xie.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xie.utils.DoubleSerializer;

import java.io.Serializable;
import java.util.Date;

public class Bonus implements Serializable {
    private int id;
    private int uid;
    private int tid;
    @JsonSerialize(using = DoubleSerializer.class)
    private double money;

    private String name;
    private String description;
    private int cid1;
    private int cid2;
    private int gid;

    @JsonSerialize(using = DoubleSerializer.class)
    private double min_amount;
    private int is_enable;
    private Date start_at;
    private Date end_at;
    private Date created_at;
    private Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCid1() {
        return cid1;
    }

    public void setCid1(int cid1) {
        this.cid1 = cid1;
    }

    public int getCid2() {
        return cid2;
    }

    public void setCid2(int cid2) {
        this.cid2 = cid2;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public double getMin_amount() {
        return min_amount;
    }

    public void setMin_amount(double min_amount) {
        this.min_amount = min_amount;
    }

    public int getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(int is_enable) {
        this.is_enable = is_enable;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}

