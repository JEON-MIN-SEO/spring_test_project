package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

//@Data 위험함...
@Getter @Setter
public class Item {
    private Long Id;
    private String itemName;
    private Integer price; //int가 아닌 Integer인 이유는 null도 가능하게 하기 위함
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
