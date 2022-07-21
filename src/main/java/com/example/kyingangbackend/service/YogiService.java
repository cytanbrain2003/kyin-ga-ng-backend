package com.example.kyingangbackend.service;

import com.example.kyingangbackend.dao.DiningTableDao;
import com.example.kyingangbackend.dao.HostelDao;
import com.example.kyingangbackend.dao.SeatDao;
import com.example.kyingangbackend.dao.YogiDao;
import com.example.kyingangbackend.entities.DiningTable;
import com.example.kyingangbackend.entities.Hostel;
import com.example.kyingangbackend.entities.Seat;
import com.example.kyingangbackend.entities.Yogi;
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
    public Yogi registerYogi(Yogi yogi){
        return yogiDao.save(yogi);
    }

    public List<Yogi> showYogis(){
        return yogiDao.findAll();
    }
}
