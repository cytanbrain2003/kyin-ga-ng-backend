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
public class DiningTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer tableNumber;
    private Integer max_number;

//    @OneToMany(mappedBy = "diningTable")
//    private List<Yogi> yogiList = new ArrayList<>();

//    public void addYogiToDiningTable(Yogi yogi){
//        yogi.setDiningTable(this);
//        yogiList.add(yogi);
//    }

    public DiningTable() {
    }

    public DiningTable(Integer tableNumber, Integer max_number) {
        this.tableNumber = tableNumber;
        this.max_number = max_number;
    }
}
