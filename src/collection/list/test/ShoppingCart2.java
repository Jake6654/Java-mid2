package collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart2 {

    List<Item> itemList = new ArrayList<>();



    public void addItem(Item item) {
        itemList.add(item);
    }


    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("상품명: " + itemList.get(i).getName() + ", 합계:" + itemList.get(i).getTotalPrice());
            total += itemList.get(i).getTotalPrice();
        }
        System.out.println("전체 가격 합:" + total);
    }
}
