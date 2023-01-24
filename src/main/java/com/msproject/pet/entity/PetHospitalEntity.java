package com.msproject.pet.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetHospitalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId;

    private String sigunName;
    private String hospitalName;
    private String operationYn;
    private String hospitalNum;
    private String hospitalZip;
    private String hospitalStreetZip;
    private String hospitalStreetAddr; // 도로명 주소
    private String hospitalAddr; // 지번 주소
    //private String hospitalId;
    private BigDecimal latitude ;
    private BigDecimal longitude;
}
