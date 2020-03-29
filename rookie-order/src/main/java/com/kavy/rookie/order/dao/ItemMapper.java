package com.kavy.rookie.order.dao;

import com.kavy.rookie.order.entiry.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {

    int insert(Item item);
    Item load(Integer item_id);

}
