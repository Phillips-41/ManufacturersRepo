package com.MakerSharks.ManufactureApi.service;

import com.MakerSharks.ManufactureApi.model.Supplier;
import org.springframework.stereotype.Service;

@Service
public class SupplierMapper {

    public Supplier toSupplierResponse(Supplier supplier) {
        return Supplier.builder()
                .supplierId(supplier.getSupplierId())
                .website(supplier.getWebsite())
                .companyName(supplier.getCompanyName())
                .location(supplier.getLocation())
                .manufacturingProcesses(supplier.getManufacturingProcesses())
                .natureOfBusiness(supplier.getNatureOfBusiness())
                .build();
    }
}
