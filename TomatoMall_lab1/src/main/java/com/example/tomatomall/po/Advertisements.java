package com.example.tomatomall.po;

import com.example.tomatomall.vo.AdvertisementsVO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "advertisements")
public class Advertisements {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int AdvertisementId;

    @Basic
    @Column(name="title",nullable = false)
    private String title;

    @Basic
    @Column(name="content",nullable = false)
    private String content;

    @Basic
    @Column(name="imgUrl",nullable = false)
    private String imgUrl;

    @Basic
    @Column(name="productId",nullable = false)
    private String productId;

    public AdvertisementsVO toVO(){
        AdvertisementsVO advertisementsVO = new AdvertisementsVO();
        advertisementsVO.setAdvertisementId(this.AdvertisementId);
        advertisementsVO.setTitle(this.title);
        advertisementsVO.setContent(this.content);
        advertisementsVO.setImgUrl(this.imgUrl);
        advertisementsVO.setProductId(this.productId);
        return advertisementsVO;
    }
}
