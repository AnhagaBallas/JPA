package com.netology.daohibarnate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Person {
    @EmbeddedId
    private PersonalData personalData;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String city;
}
