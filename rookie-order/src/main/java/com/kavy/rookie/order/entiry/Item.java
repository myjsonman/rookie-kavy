package com.kavy.rookie.order.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
    private Integer itemId;
    private String itemName;
    private String itemImage;
    private Double price;
}
