package com.MakerSharks.ManufactureApi.service;

import com.MakerSharks.ManufactureApi.common.PageResponse;
import com.MakerSharks.ManufactureApi.model.Supplier;
import com.MakerSharks.ManufactureApi.model.SupplierQueryRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierService {
    private  final SupplierRepository repository;
    private final SupplierMapper supplierMapper;

    public PageResponse<Supplier> querySuppliers(@Valid SupplierQueryRequest request, int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<Supplier> suppliers =repository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(request.location(),request.natureOfBusiness(),request.manufacturingProcess(),pageable);
        List<Supplier> suppliersResponse = suppliers.stream()
                .map(supplierMapper :: toSupplierResponse)
                .toList();
        return new PageResponse<>(
                suppliersResponse,
                suppliers.getNumber(),
                suppliers.getSize(),
                suppliers.getTotalElements(),
                suppliers.getTotalPages(),
                suppliers.isFirst(),
                suppliers.isLast()
        );
    };
}
