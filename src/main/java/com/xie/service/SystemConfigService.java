package com.xie.service;

import com.xie.bean.SysConfig;

import java.util.List;

/**
 * @Author xie
 * @Date 17/2/22 下午7:39.
 */
public interface SystemConfigService {

    SysConfig getById(int id);

    List<SysConfig> getAll();

    int insert(SysConfig sysConfig);

    int update(SysConfig sysConfig);

    int delete(SysConfig sysConfig);

    int delete(int id);
}
