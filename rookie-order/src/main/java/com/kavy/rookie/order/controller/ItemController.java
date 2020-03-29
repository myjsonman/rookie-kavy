package com.kavy.rookie.order.controller;

import com.kavy.rookie.order.entiry.Item;
import com.kavy.rookie.order.service.ItemService;
import com.kavy.rookie.order.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/insert")
    public CommonResult insert(Item item){
        int result = itemService.insert(item);
        if (result>0){
            System.out.println("插入数据库成功！");
            return new CommonResult(200,"插入数据库成功！",result);
        }else {
            System.out.println();
            return new CommonResult(444,"插入数据库失败!",null);
        }
    }

    @GetMapping("/get/{itemId}")
    public CommonResult get(@PathVariable int itemId){
        Item result = itemService.load(itemId);
        if (result!=null){
            System.out.println("插入数据库成功！");
            return new CommonResult(200,"查询成功！",result);
        }else {
            System.out.println();
            return new CommonResult(444,"查询失败!",null);
        }
    }

    @Value("${server.port}")
    private String servicePort;
    @GetMapping("/getPort")
    public String itemService(){
        return servicePort;
    }
}
