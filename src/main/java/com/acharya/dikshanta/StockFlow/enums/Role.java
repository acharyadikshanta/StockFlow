package com.acharya.dikshanta.StockFlow.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

import static com.acharya.dikshanta.StockFlow.enums.Permission.*;

@Getter
@AllArgsConstructor
public enum Role {
    SUPER_ADMIN(List.of(
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
            PRODUCT_SELL
    )),

    MANAGER(List.of(
            STAFF_CREATE,
            STAFF_FETCH,
            ALL_STAFF_FETCH,
            STAFF_UPDATE,

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
            PRODUCT_SELL
    )),

    ACCOUNTANT(List.of(
            STAFF_FETCH,
            ALL_STAFF_FETCH,

            CATEGORY_FETCH,
            ALL_CATEGORY_FETCH,

            PRODUCT_FETCH,
            ALL_PRODUCT_FETCH,
            PRODUCT_RESTOCK,
            PRODUCT_SELL
    ));

    private final List<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(
                permissions.stream()
                        .map(permission -> new SimpleGrantedAuthority(permission.name()))
                        .toList()
        );
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
