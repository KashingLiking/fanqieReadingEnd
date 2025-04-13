package com.example.tomatomall.serviceImpl;

import com.example.tomatomall.po.*;
import com.example.tomatomall.repository.AccountRepository;
import com.example.tomatomall.repository.CartsRepository;
import com.example.tomatomall.repository.OrdersRepository;
import com.example.tomatomall.repository.ProductRepository;
import com.example.tomatomall.service.CartsService;
import com.example.tomatomall.service.OrdersService;
import com.example.tomatomall.util.SecurityUtil;
import com.example.tomatomall.vo.*;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private CartsRepository cartsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SecurityUtil securityUtil;

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    @Transactional
    public AliPay putAfford(Integer orderId) {
        return null;
    }

}