package com.kavy.rookie.order.service;

import com.kavy.rookie.order.entiry.Item;

public interface ItemService {
    int insert(Item item);
    Item load(Integer id);
}
