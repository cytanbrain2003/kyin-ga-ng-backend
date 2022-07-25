package com.example.kyingangbackend.entities;

import lombok.*;

import javax.persistence.Column;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class YogiDto {

    private Integer id;

    private String name;

    private String nrc;

    private Integer age;

    private Integer dhamaAge;

    private String phoneNumber;

    private String gender;

    private String hostelName;

    private Integer diningTableNo;

    private Integer seatNo;
}
