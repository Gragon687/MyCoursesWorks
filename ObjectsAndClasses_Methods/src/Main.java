public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 3, 14);
        basket.add("Coffee", 50, 10, 5);
        basket.print("Milk");
        double weight =basket.getTotalWeight();
        System.out.println(weight);


    }
}
