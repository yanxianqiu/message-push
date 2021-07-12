package com.yan.message.controller;

import com.yan.message.util.WebSocketMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/shop")
@Controller
public class ListController {

    @Autowired
    private WebSocketMessage webSocket;

    /**
     * 触发推送
     * 举例：list方法可以是订单列表，这个方法可以是下单的接口，下单后，list的订单列表提示收到新订单。
     * @return
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        webSocket.sendMessage("hello，来了新数据呢～");
        return "send over,Please return to the list request page。";
    }

}
