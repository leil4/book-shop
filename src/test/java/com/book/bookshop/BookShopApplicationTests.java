package com.book.bookshop;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.book.bookshop.entity.OrderQueryVo;
import com.book.bookshop.mapper.CartMapper;
import com.book.bookshop.mapper.OrderMapper;
import com.book.bookshop.service.BookService;
import com.book.bookshop.utils.OrderUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

@SpringBootTest
class BookShopApplicationTests {
    @Autowired
    private BookService bookService;
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void findBookList(){
        bookService.list().forEach(System.out::println);
    }

    @Test
    public void findCartList(){
        cartMapper.findCartListByUserId(1).forEach(System.out::println);
    }

    @Test
    public void findOrderList(){
        OrderQueryVo orderQueryVo = new OrderQueryVo();
        orderQueryVo.setUserId(1);
        orderQueryVo.setBegin(0);
        orderQueryVo.setEnd(2);
        orderQueryVo.setOrderBy("bo.create_date  desc");
        orderMapper.findOrderAndOrderDetailListByUser(orderQueryVo);
    }

    @Test
    public void testCreateOrderNo(){
        System.out.println(OrderUtils.createOrderNum());
    }


}
