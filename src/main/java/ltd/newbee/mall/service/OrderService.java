package ltd.newbee.mall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import ltd.newbee.mall.controller.vo.*;
import ltd.newbee.mall.entity.Order;

import java.util.List;

public interface OrderService extends IService<Order> {
    IPage selectMyOrderPage(Page<OrderListVO> page, Order order);

    IPage selectPage(Page<Order> page, OrderVO orderVO);

    String saveOrder(MallUserVO mallUserVO, Long couponUserId, List<ShopCatVO> shopcatVOList);

    List<CountMallVO> countMallTransactionAmount();
}
