package com.itemmania.controller.userController.myRoomController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myroom/trnsc_hstry")
public class MyTrasactionHistortyController {


    @GetMapping
    public String getMyTrnscHstry()
    {
        return "UserForm/myRoom/trade/myTransactionHistory";
    }


}
