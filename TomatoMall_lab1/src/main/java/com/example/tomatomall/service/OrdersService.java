package com.example.tomatomall.service;

import com.example.tomatomall.vo.AliPayVO;
import com.example.tomatomall.vo.OrdersVO;

import java.math.BigDecimal;

public interface OrdersService {
    AliPayVO putAfford(Integer orderId);
    void handlePaymentSuccess(String orderId, String alipayTradeNo, BigDecimal amount);
}
