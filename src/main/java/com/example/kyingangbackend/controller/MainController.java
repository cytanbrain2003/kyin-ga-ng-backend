package com.example.kyingangbackend.controller;

import com.example.kyingangbackend.entities.*;
import com.example.kyingangbackend.service.DiningTableService;
import com.example.kyingangbackend.service.HostelService;
import com.example.kyingangbackend.service.SeatService;
import com.example.kyingangbackend.service.YogiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/register")
    public ResponseEntity<Yogi> register(@RequestBody YogiDto yogiDto){

//        hostelService.saveHostel(new Hostel("Ingin1",5));
//        diningTableService.saveDiningTable(new DiningTable(1,5));
//        seatService.saveSeat(new Seat(1));

        Hostel hostel = hostelService.findHostelByName(yogiDto.getHostelName());

        DiningTable diningTable = diningTableService.findDiningTableByTableNumber(yogiDto.getDiningTableNo());

        Seat seat = seatService.findSeatBySeatNumber(yogiDto.getSeatNo());

        Yogi yogi = yogiService.registerYogi(yogiDto,hostel,diningTable,seat);

        return ResponseEntity.status(HttpStatus.OK).body(yogi);
    }

    @GetMapping("yogi")
    public List<Yogi> showYogis(){
        return yogiService.showYogis();
    }
}
