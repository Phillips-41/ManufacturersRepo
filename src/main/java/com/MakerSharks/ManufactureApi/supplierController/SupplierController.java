package com.MakerSharks.ManufactureApi.supplierController;

import com.MakerSharks.ManufactureApi.common.PageResponse;
import com.MakerSharks.ManufactureApi.model.Supplier;
import com.MakerSharks.ManufactureApi.model.SupplierQueryRequest;
import com.MakerSharks.ManufactureApi.service.SupplierService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/supplier")
public class SupplierController {
    private final SupplierService service;

    @PostMapping("/query")
    public ResponseEntity<PageResponse<Supplier>> querySuppliers
            (@RequestBody @Valid SupplierQueryRequest request,
             @RequestParam(name = "page",defaultValue ="0",required = false)int page,
             @RequestParam(name = "size",defaultValue ="10",required = false)int size) {
        return ResponseEntity.ok(service.querySuppliers(request,page,size));

    }
}
