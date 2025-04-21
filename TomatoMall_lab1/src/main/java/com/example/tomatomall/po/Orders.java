package com.example.tomatomall.po;

import com.example.tomatomall.vo.OrdersVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "orderId")
    private Integer id;

    @Column(name = "total_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "payment_method", nullable = false, length = 50)
    private String paymentMethod;

    @Column(name = "status", nullable = false, columnDefinition = "VARCHAR(20) DEFAULT 'PENDING'")
    private String status = "PENDING";

    @Column(name = "create_time", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private Account account;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CartsOrdersRelation> cartsOrdersRelations = new ArrayList<>();

    public OrdersVO toVO() {
        OrdersVO ordersVO = new OrdersVO();
        ordersVO.setId(this.id);
        ordersVO.setUserName(this.account.getName());
        ordersVO.setTotalAmount(this.totalAmount);
        ordersVO.setPaymentMethod(this.paymentMethod);
        ordersVO.setStatus(this.status);
        ordersVO.setCreateTime(this.createTime);
        return ordersVO;
    }
}