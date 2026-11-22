package com.acharya.dikshanta.StockFlow.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum Permission {
    STAFF_CREATE,
    STAFF_FETCH,
    ALL_STAFF_FETCH,
    STAFF_UPDATE,
    STAFF_DELETE,

    CATEGORY_CREATE,
    CATEGORY_FETCH,
    ALL_CATEGORY_FETCH,
    CATEGORY_UPDATE,
    CATEGORY_DELETE,

    PRODUCT_CREATE,
    PRODUCT_FETCH,
    ALL_PRODUCT_FETCH,
    PRODUCT_UPDATE,
    PRODUCT_DELETE,
    PRODUCT_ACTIVATE,
    PRODUCT_DEACTIVATE,
    PRODUCT_RESTOCK,
    PRODUCT_SELL;


}
