package com.jesper.seckill.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SecKillGoods implements Serializable {
    private static final long serialVersionUID = -7639049712132126120L;
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
    private int version;

}
