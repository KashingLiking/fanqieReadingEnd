package com.example.tomatomall.service;

import com.example.tomatomall.vo.AliPay;

public interface OrdersService {
    AliPay putAfford(Integer orderId);
}
