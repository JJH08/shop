package shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shop.ProductApplication;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer stock;

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        SoldOut soldOut = new SoldOut(inventory);
        soldOut.publishAfterCommit();
        StopDecreased stopDecreased = new StopDecreased(inventory);
        stopDecreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);

            SoldOut soldOut = new SoldOut(inventory);
            soldOut.publishAfterCommit();
            StopDecreased stopDecreased = new StopDecreased(inventory);
            stopDecreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
