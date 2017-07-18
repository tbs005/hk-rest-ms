package com.team.hk.orderInfo.controller;

import com.team.hk.orderInfo.entity.OrderDishInfo;
import com.team.hk.orderInfo.entity.OrderInfo;

import java.util.List;

/**
 * Created by lidongliang on 2017/6/27.
 * 订单信息接口
 */
public interface OrderInfoController {

    /**
     * 获得订单信息（通过分页）
     *
     * @return List<OrderInfo>
     */
    List<OrderInfo> getAllOrderInfoByPage(OrderInfo orderInfo, Long pageNo, Long pageSize);

    /**
     * 获得订单信息
     *
     * @return List<OrderInfo>
     */
    List<OrderInfo> getAllOrderInfo(Long id);

    /**
     * 增加订单
     *
     * @param orderInfo 订单实体
     * @return rowsAffected
     */
    int addOrderInfo(OrderInfo orderInfo, List<OrderDishInfo> orderDishInfo);

    /**
     * 修改订单
     *
     * @param orderInfo 订单实体
     * @return rowsAffected
     */
    int updateOrderInfo(OrderInfo orderInfo);

    /**
     * 删除一个订单
     *
     * @param id 订单ID
     * @return rowsAffected
     */
    int deleteOrderInfoById(Long id);

    /**
     * 删除多个订单
     *
     * @param id 订单ID
     * @return rowsAffected
     */
    int deleteOrderInfoByIds(List<Long> id);
}

