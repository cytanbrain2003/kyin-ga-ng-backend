package com.example.kyingangbackend.service;

import com.example.kyingangbackend.dao.DiningTableDao;
import com.example.kyingangbackend.dao.HostelDao;
import com.example.kyingangbackend.dao.SeatDao;
import com.example.kyingangbackend.dao.YogiDao;
import com.example.kyingangbackend.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class YogiService {

    @Autowired
    private YogiDao yogiDao;
    @Autowired
    private SeatDao seatDao;
    @Autowired
    private HostelDao hostelDao;
    @Autowired
    private DiningTableDao diningTableDao;

    @Transactional
    public Yogi registerYogi(YogiDto yogiDto,Hostel hostel,DiningTable diningTable,Seat seat){
        Yogi yogi = toEntity(yogiDto);
        yogi.setHostel(hostel);
        yogi.setDiningTable(diningTable);
        yogi.setSeat(seat);
        return yogiDao.save(yogi);
    }

    public List<Yogi> showYogis(){
        return yogiDao.findAll();
    }

    private Yogi toEntity(YogiDto yogiDto){
        return new Yogi(yogiDto.getName(),
                        yogiDto.getNrc(),
                        yogiDto.getAge(),
                        yogiDto.getDhamaAge(),
                        yogiDto.getPhoneNumber(),
                        yogiDto.getGender());
    }
}
