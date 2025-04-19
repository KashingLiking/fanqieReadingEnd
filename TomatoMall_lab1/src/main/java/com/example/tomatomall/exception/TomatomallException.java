package com.example.tomatomall.exception;

public class TomatomallException extends RuntimeException {
    private String errorCode; // 添加一个用于存储错误代码的字段

    // 修改构造函数以接受错误代码和错误消息
    public TomatomallException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    // 修改静态方法以包含错误代码
    public static TomatomallException usernameAlreadyExists() {
        return new TomatomallException("404", "用户名已存在");
    }

    public static TomatomallException usernameOrPasswordError() {
        return new TomatomallException("404", "用户名或密码错误");
    }

    public static TomatomallException usernameNotExits() {
        return new TomatomallException("404", "用户名不存在");
    }

    public static TomatomallException notLogin() {
        return new TomatomallException("401", "用户未登录");
    }

    public static TomatomallException productsNotExits() {
        return new TomatomallException("400", "商品不存在");
    }

    public static TomatomallException productsNotEnough() {
        return new TomatomallException("405", "商品不够");
    }

}