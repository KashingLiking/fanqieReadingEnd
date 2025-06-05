package com.example.tomatomall.service;

import com.example.tomatomall.vo.AccountVO;

import java.math.BigDecimal;

public interface AccountService {
    String register(AccountVO accountVO);

    String login(String username,String password);

    AccountVO getInformation(String username);

    String updateInformation(AccountVO accountVO);

    void addToTotalSpent(Integer userId, BigDecimal amount);
}
