package com.example.tomatomall.controller;

import com.example.tomatomall.service.CartsService;
import com.example.tomatomall.service.OrdersService;
import com.example.tomatomall.vo.*;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

    @Resource
    private OrdersService ordersService;

    /**
     * 发起支付
     */
    @PostMapping("/{orderId}/pay")
    public ResponseVO<AliPay> putAfford(@PathVariable("orderId") Integer orderId) {
        return ResponseVO.buildSuccess(ordersService.putAfford(orderId));
    }

//    @PostMapping("/checkout")
//    public ResponseVO<OrdersVO> createOrder(
//            @RequestBody CheckoutRequestVO checkoutRequestVO) {
//        return ResponseVO.buildSuccess(cartsService.createOrder(checkoutRequestVO));
//    }
}