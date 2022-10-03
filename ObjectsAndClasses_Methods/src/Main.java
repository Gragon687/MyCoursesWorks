public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 3, 14);
        basket.add("Coffee", 50, 10, 5);
        basket.print("First Basket");
        System.out.println(basket.getTotalWeight());

        Basket basket1 = new Basket();
        basket1.add("Milk", 40, 10, 14);
        basket1.add("Coffee", 50, 15, 5);
        basket1.print("Second Basket");

        System.out.println(Basket.getPriceOfAllBaskets());
        System.out.println(Basket.getTotalItemsCount());
        System.out.println(Basket.averagePriceOfBaskets());
        System.out.println(Basket.averagePriceOfItems());


    }
}
