package com.sarin.springtest.springpet_clinic_app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Harsh Sarin
 */
@Entity
@Table(name = "visits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
