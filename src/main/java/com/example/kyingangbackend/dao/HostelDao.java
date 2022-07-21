package com.example.kyingangbackend.dao;

import com.example.kyingangbackend.entities.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelDao extends JpaRepository<Hostel,Integer> {
}
