package collection.list.test;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart2 cart = new ShoppingCart2();
        Item item = new Item("마늘", 2000, 2);
        Item item1 = new Item("상추", 3000, 4);

        cart.addItem(item);
        cart.addItem(item1);

        cart.displayItems();
    }
}
