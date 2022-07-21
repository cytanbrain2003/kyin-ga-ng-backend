package com.example.kyingangbackend.controller;

import com.example.kyingangbackend.entities.DiningTable;
import com.example.kyingangbackend.entities.Hostel;
import com.example.kyingangbackend.entities.Seat;
import com.example.kyingangbackend.entities.Yogi;
import com.example.kyingangbackend.service.DiningTableService;
import com.example.kyingangbackend.service.HostelService;
import com.example.kyingangbackend.service.SeatService;
import com.example.kyingangbackend.service.YogiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private YogiService yogiService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private HostelService hostelService;
    @Autowired
    private DiningTableService diningTableService;

    @GetMapping("/register")
    public String register(){

        Hostel h1 = new Hostel("InnGyin1",5);
        Seat s1 = new Seat(1);
        DiningTable d1 = new DiningTable("101",5);

        Yogi y1 = new Yogi("Kyaw Kyaw","12/UKAMA(C)123456",30,0,"0912345678","MALE");

//        h1.addYogiToHostel(y1);
//        s1.addYogiToSeat(y1);
//        d1.addYogiToDiningTable(y1);

        y1.setHostel(h1);
        y1.setSeat(s1);
        y1.setDiningTable(d1);

        yogiService.registerYogi(y1);

        return "success";
    }

    @GetMapping("yogi")
    public List<Yogi> showYogis(){
        return yogiService.showYogis();
    }
}
