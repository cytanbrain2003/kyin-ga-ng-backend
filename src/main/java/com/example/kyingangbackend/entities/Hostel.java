package com.example.kyingangbackend.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Hostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer max_number;

//    @OneToMany(mappedBy = "hostel")
//    private List<Yogi> yogiList = new ArrayList<>();

//    public void addYogiToHostel(Yogi yogi){
//        yogi.setHostel(this);
//        yogiList.add(yogi);
//    }

    public Hostel() {
    }

    public Hostel(String name, Integer max_number) {
        this.name = name;
        this.max_number = max_number;
    }
}
