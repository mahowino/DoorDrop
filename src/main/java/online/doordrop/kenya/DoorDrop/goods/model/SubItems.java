package online.doordrop.kenya.DoorDrop.goods.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data
public class SubItems {
    @Id
    long subItemID;

    long itemId;
    String name;
    String description;

    double itemPrice;

}
