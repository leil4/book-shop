package com.book.bookshop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.Book;
import com.book.bookshop.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
 * @author leilei
 * @date 2020-12-02 16:12
 * 图书服务层（业务层）
 */
@Service
public class BookService extends ServiceImpl<BookMapper, Book> {
}
