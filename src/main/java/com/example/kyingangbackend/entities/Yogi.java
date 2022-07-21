package com.example.kyingangbackend.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Yogi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "nrc")
    private String nrc;
    @Column(name = "age")
    private Integer age;
    @Column(name = "dhama_age")
    private Integer dhamaAge;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "gender")
    private String gender;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Hostel hostel;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private DiningTable diningTable;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Seat seat;

    public Yogi() {
    }

    public Yogi(String name, String nrc, Integer age, Integer dhamaAge, String phoneNumber, String gender) {
        this.name = name;
        this.nrc = nrc;
        this.age = age;
        this.dhamaAge = dhamaAge;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}
