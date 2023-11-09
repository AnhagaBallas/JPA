package com.netology.daohibarnate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class PersonalData implements Serializable {

    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private String surname;


    @Column(nullable = false)
    private String age;
}
