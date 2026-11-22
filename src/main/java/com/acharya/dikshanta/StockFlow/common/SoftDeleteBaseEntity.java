package com.acharya.dikshanta.StockFlow.common;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class SoftDeleteBaseEntity extends BaseEntity {
    @Builder.Default
    @Column(name = "deleted", nullable = false)
    private boolean deleted = false;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    public void softDelete() {
        if (deleted) {
            throw new IllegalStateException("It is already deleted");
        }
        this.deleted = true;
        this.deletedAt = LocalDateTime.now();
    }

    public void undoSoftDelete() {
        if (!deleted) {
            throw new IllegalStateException("It is already active");
        }
        this.deleted = false;
        this.deletedAt = LocalDateTime.now();
    }
}
