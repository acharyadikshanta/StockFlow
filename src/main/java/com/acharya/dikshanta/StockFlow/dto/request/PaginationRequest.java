
package com.acharya.dikshanta.StockFlow.dto.request;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public record PaginationRequest(
        Integer pageNumber,
        Integer pageSize,
        String sortByProperty,
        String sortDirection
) {
    public Pageable toPageable() {
        int pageNo = pageNumber != null ? pageNumber : 0;
        int pageSz = pageSize != null ? pageSize : 10;

        String sortBy = sortByProperty != null && !sortByProperty.isBlank()
                ? sortByProperty.toLowerCase()
                : "id";

        Sort.Direction sortDir = "desc".equalsIgnoreCase(sortDirection)
                ? Sort.Direction.DESC
                : Sort.Direction.ASC;

        return PageRequest.of(pageNo, pageSz, Sort.by(sortDir, sortBy));
    }
}
