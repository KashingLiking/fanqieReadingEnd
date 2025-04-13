package com.example.tomatomall.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CheckoutRequestVO {
    private List<String> cartItemIds;

    private ShippingAddress shippingAddress;  // 嵌套对象

    private String paymentMethod;

    private static class ShippingAddress{
        private String name;        // 收货人姓名

        private String phone;       // 联系电话

        private String postalCode;  // 邮编

        private String address;     // 详细地址

        private String province;    // 省份（可选）

        private String city;        // 城市（可选）

        private String district;   // 区县（可选）
    }
}

