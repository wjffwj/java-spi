package com.wjf.service;

import com.alibaba.dubbo.common.extension.SPI;

public class WeixinOrderService implements OrderService {
    public void submit() {
        System.out.println("向騰訊提交訂單...");
    }
}
