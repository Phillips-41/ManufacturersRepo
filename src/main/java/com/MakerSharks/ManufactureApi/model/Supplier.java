package com.MakerSharks.ManufactureApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplier {
    @Id
    @GeneratedValue()
    private Long supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcesses;
}

