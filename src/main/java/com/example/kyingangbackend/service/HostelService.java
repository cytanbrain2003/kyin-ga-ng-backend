package com.example.kyingangbackend.service;

import com.example.kyingangbackend.dao.HostelDao;
import com.example.kyingangbackend.entities.Hostel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HostelService {

    @Autowired
    private HostelDao hostelDao;

    @Transactional
    public Hostel saveHostel(Hostel hostel){
        return hostelDao.save(hostel);
    }

    public Hostel findHostelByName(String name){
        return hostelDao.findByName(name);
    }
}
