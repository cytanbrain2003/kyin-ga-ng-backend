package com.example.kyingangbackend.dao;

import com.example.kyingangbackend.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatDao extends JpaRepository<Seat,Integer> {
}
