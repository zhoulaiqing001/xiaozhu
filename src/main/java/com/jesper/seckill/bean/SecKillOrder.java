package com.jesper.seckill.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SecKillOrder implements Serializable {
    private static final long serialVersionUID = -8382088556316580290L;
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
