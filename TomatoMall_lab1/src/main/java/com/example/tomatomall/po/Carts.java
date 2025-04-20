package com.example.tomatomall.po;

import com.example.tomatomall.vo.CartItemVO;
import com.example.tomatomall.vo.CartItemsVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "carts")  // Changed to match your table name
public class Carts {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cartItemId")
    private int cartItemId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false , unique = true)
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Basic
    @Column(name = "quantity", nullable = false, columnDefinition = "INT DEFAULT 1")
    private int quantity = 1;

    @OneToMany(mappedBy = "cartItem", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CartsOrdersRelation> cartsOrdersRelations = new ArrayList<>();

    public CartItemVO toItemVO() {
        CartItemVO cartItemVO = new CartItemVO();
        cartItemVO.setCartItemId(this.cartItemId);
        cartItemVO.setProductId(this.product.getProductId());
        cartItemVO.setTitle(this.product.getTitle());
        cartItemVO.setPrice(this.product.getPrice());
        cartItemVO.setDescription(this.product.getDescription());
        cartItemVO.setCover(this.product.getCover());
        cartItemVO.setDetail(this.product.getDetail());
        cartItemVO.setQuantity(this.quantity);
        return cartItemVO;
    }
}