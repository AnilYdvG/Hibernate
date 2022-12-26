package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dto.FoodOrder;
import com.dto.Item;
import com.service.FoodOrderService;


public class SaveFoodOrderItem 
{

	public static void main(String[] args) 
	{
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Jerry");
		foodOrder.setPhNo(4646845984l);
		foodOrder.setAddress("Delhi");
		
		FoodOrderService foodOrderService = new FoodOrderService();
		
		Item item1 = new Item();
		item1.setName("Sandwich");
		item1.setCost(699);
		item1.setQuantity(9);
		item1.setFoodOrder(foodOrder);
		
		Item item2  = new Item();
		item2.setName("pizza");
		item2.setCost(744);
		item2.setQuantity(5);
		item2.setFoodOrder(foodOrder);
		
		Item item3  = new Item();
		item3.setName("burger");
		item3.setCost(266);
		item3.setQuantity(3);
		item3.setFoodOrder(foodOrder);
		
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item1);
		
		List<FoodOrder> foodOrders = new ArrayList<FoodOrder>();
		foodOrders.add(foodOrder);
		
		foodOrder.setItems(items);
		foodOrderService.saveOrder(foodOrder);
		
		
	}
}
