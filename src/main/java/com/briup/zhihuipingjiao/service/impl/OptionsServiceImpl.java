package com.briup.zhihuipingjiao.service.impl;

import com.briup.zhihuipingjiao.bean.Options;
import com.briup.zhihuipingjiao.mapper.OptionsMapper;
import com.briup.zhihuipingjiao.service.IOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionsServiceImpl implements IOptionsService {
    @Autowired
    private OptionsMapper optionsMapper;

    @Override
    public void saveOrUpdate(Options options) throws RuntimeException {
        if (options.getId()==null){
            optionsMapper.insert(options);
        }else {
            optionsMapper.updateByPrimaryKey(options);
        }


    }
}
