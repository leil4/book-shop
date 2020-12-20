package com.book.bookshop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.Order;
import com.book.bookshop.entity.OrderQueryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author leilei
 * @date 2020-12-14 15:30
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
    /**
     * 根据用户id查询用户订单以及订单明细
     */
//    List<Order> findOrderAndOrderDetailListByUser(Integer id);
    List<Order> findOrderAndOrderDetailListByUser(OrderQueryVo orderQueryVo);

    /**
     * 查询记录总条数
     */
    Integer findOrderCountByUser(OrderQueryVo orderQueryVo);
}
