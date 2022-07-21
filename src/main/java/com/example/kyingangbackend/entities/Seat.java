package com.example.kyingangbackend.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seatNumber;

//    @OneToOne(mappedBy = "seat")
//    private Yogi yogi;

//    public void addYogiToSeat(Yogi yogi){
//        yogi.setSeat(this);
//        this.yogi = yogi;
//    }

    public Seat() {
    }

    public Seat(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
}
