package com.jesper.seckill.bean;

import lombok.Data;

import java.io.Serializable;


@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = -5826632604715782758L;
    private Long id;
    private String goodsName;
    private String goodsTitle;
    private String goodsImg;
    private String goodsDetail;
    private Double goodsPrice;
    private Integer goodsStock;
}
