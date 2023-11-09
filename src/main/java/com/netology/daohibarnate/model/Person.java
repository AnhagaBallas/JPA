package com.netology.daohibarnate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

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
