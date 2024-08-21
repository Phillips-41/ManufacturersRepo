package com.MakerSharks.ManufactureApi.service;

import com.MakerSharks.ManufactureApi.model.Supplier;
import com.MakerSharks.ManufactureApi.model.SupplierQueryRequest;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location,
            String natureOfBusiness,
            String manufacturingProcesses,
            Pageable pageable
    );

}
