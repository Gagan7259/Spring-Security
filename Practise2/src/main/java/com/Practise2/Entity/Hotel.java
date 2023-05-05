package com.Practise2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Practise2")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    private String id;
    @Column(name = "HotelName")
    private String name;
    @Column(name = "HotelLocation")
    private String location;
    @Column(name = "HotelAbout")
    private String about;
}
