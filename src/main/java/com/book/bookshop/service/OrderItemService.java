package com.book.bookshop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.OrderItem;
import com.book.bookshop.mapper.OderItemMapper;
import org.springframework.stereotype.Service;

/**
 * @author leilei
 * @date 2020-12-14 15:32
 */
@Service
public class OrderItemService extends ServiceImpl<OderItemMapper, OrderItem> {
}
