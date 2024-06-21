package com.eventostec.api.domain.coupon;


import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table( name = "coupon")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private Integer discount;

    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")

    private Event event;
}
