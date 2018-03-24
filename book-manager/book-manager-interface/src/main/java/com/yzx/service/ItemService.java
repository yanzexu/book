package com.yzx.service;


import com.yzx.common.EasyUIDataGridResult;
import com.yzx.entity.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
}
