package com.service;

import com.dao.FoodOrderDao;
import com.dto.FoodOrder;

public class FoodOrderService 
{

	public void saveOrder(FoodOrder foodOrder)
	{
		FoodOrderDao foodOrderDao= new FoodOrderDao();
		foodOrderDao.saveOrder(foodOrder);
	}
}
