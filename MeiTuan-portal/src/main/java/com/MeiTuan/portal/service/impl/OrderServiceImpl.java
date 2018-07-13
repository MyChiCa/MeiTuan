
package com.MeiTuan.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MeiTuan.portal.mapper.OrderMapper;
import com.MeiTuan.portal.mapper.TOderExtendMapper;
import com.MeiTuan.portal.mapper.TOrderDetailsMapper;

import com.MeiTuan.portal.pojo.OrderExtend;
import com.MeiTuan.portal.pojo.Order;
import com.MeiTuan.portal.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderMapper orderMapper;
@Autowired
TOrderDetailsMapper tOrderDetailsMapper;
@Autowired
TOderExtendMapper tOderExtendMapper;

	@Override
	public List<OrderExtend> showOrder(int orderId) {
		List<OrderExtend> list = tOderExtendMapper.showOrder(orderId);
		return list;
	}
	@Override
	public OrderExtend showMoney(Integer id) {
		OrderExtend orderExtend = tOderExtendMapper.showTotalMoney(id);
		return orderExtend;
	}
	@Override
	public void updateState(Integer id) {
		tOderExtendMapper.updateState(id);		
	}
	
	//插入订单
	@Override
	public void insertOrder(Order tOrder) {
		orderMapper.insertOrder(tOrder);
	}
	
	//获得订单头
	@Override
	public Order findOrderhead(int orderId) {
		Order order = orderMapper.orderMapper(orderId);
		return order;
	}
	
	//最终状态
	@Override
	public void updateFinishState(int orderId) {
		orderMapper.updateFinishState(orderId);
	}

}


