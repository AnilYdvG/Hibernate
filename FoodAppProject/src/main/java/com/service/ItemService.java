package com.service;

import java.util.List;

import com.dao.ItemDao;
import com.dto.Item;

public class ItemService 
{
	public void saveItem(List<Item> items)
	{
		ItemDao itemDao = new ItemDao();
		itemDao.saveItem(items);
	}

}
