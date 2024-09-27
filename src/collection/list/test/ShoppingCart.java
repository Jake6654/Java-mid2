package collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<String> itemName = new ArrayList<>();
    List<Integer> itemPrice = new ArrayList<>();


    public void addItem(Item item) {
        itemName.add(item.getName());
        itemPrice.add(item.getTotalPrice());
    }


    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemName.size(); i++) {
            System.out.println("상품명: " + itemName.get(i) + ", 합계:" + itemPrice.get(i));
            total += itemPrice.get(i);
        }
        System.out.println("전체 가격 합:" + total);
    }
}
