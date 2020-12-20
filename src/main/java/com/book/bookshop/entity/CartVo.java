package com.book.bookshop.entity;

import lombok.Data;

/**
 * @author leilei
 * @date 2020-12-09 13:54
 */
@Data
public class CartVo {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Integer count;
    private String bookName;
    private String imgUrl;
    private double newPrice;
}
