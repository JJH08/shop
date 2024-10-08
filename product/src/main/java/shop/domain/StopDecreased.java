package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StopDecreased extends AbstractEvent {

    private Long id;
    private Integer stock;

    public StopDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public StopDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
