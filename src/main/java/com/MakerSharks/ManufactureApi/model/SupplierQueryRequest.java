package com.MakerSharks.ManufactureApi.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record SupplierQueryRequest(
        @NotNull(message = "Location is required")
        String location,
        @NotNull(message = "natureOfBusiness is required")
        @Pattern(regexp = "SMALL_SCALE|MEDIUM_SCALE|LARGE_SCALE",
                 message = "Nature of business must be SMALL_SCALE, MEDIUM_SCALE, or LARGE_SCALE")
        String natureOfBusiness,
        @NotNull(message = "Manufacturing process is required")
        @Pattern(regexp = "MOULDING|_3D_PRINTING|CASTING|COATING",
                message = "Manufacturing process must be one of MOULDING, _3D_PRINTING, CASTING, or COATING")
        String manufacturingProcess
) { }
