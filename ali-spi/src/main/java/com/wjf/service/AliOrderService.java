package com.wjf.service;

import com.alibaba.dubbo.common.extension.SPI;

public class AliOrderService implements OrderService {
    public void submit() {
        System.out.println("向阿里巴巴提交訂單...");
    }
}
