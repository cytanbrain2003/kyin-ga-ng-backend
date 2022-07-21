package com.example.kyingangbackend.service;

import com.example.kyingangbackend.dao.SeatDao;
import com.example.kyingangbackend.entities.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeatService {

    @Autowired
    private SeatDao seatDao;

    @Transactional
    public Seat saveSeat(Seat seat){
        return seatDao.save(seat);
    }
}
