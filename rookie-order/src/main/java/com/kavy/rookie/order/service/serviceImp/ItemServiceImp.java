package com.kavy.rookie.order.service.serviceImp;

import com.kavy.rookie.order.dao.ItemMapper;
import com.kavy.rookie.order.entiry.Item;
import com.kavy.rookie.order.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImp implements ItemService {

    @Autowired
   private ItemMapper itemMapper;
    @Override
    public int insert(Item item) {
        return itemMapper.insert(item);
    }

    @Override
    public Item load(Integer itemId) {
        return itemMapper.load(itemId);
    }
}
