package com.book.bookshop.entity.enums;

import lombok.Data;

/**
 * @author leilei
 * @date 2020-12-09 15:20
 * 用户购物车信息展示对象
 */
@Data
public class UserCartVo {
    private Integer num;
    private double totalPrice;
}
