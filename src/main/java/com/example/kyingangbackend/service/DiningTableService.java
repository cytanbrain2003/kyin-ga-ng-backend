package com.example.kyingangbackend.service;

import com.example.kyingangbackend.dao.DiningTableDao;
import com.example.kyingangbackend.entities.DiningTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DiningTableService {

    @Autowired
    private DiningTableDao diningTableDao;

    @Transactional
    public DiningTable saveDiningTable(DiningTable diningTable){
        return diningTableDao.save(diningTable);
    }
}
