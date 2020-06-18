package com.wjf.service;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface OrderService {
    public void submit();
}
