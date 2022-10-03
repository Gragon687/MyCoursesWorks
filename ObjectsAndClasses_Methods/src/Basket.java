public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalItemsCount = 0;
    private static int priceOfAllBaskets = 0;

    public static int getTotalItemsCount() {
        return totalItemsCount;
    }

    public static int getPriceOfAllBaskets() {
        return priceOfAllBaskets;
    }

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 999999000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static void items(int count){
        Basket.totalItemsCount += count;
    }
    public  static  void allBasketsPrice(int price, int count){
        Basket.priceOfAllBaskets += (price * count);
    }

    public static int averagePriceOfItems(){
        int averagePrice = Basket.getPriceOfAllBaskets() / Basket.getTotalItemsCount();
        return averagePrice;
    }
    public static int averagePriceOfBaskets(){
        int averagePrice = Basket.getPriceOfAllBaskets() / Basket.count;
        return averagePrice;
    }
    public void add(String name, int price) {
        add(name, price, 1);

    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        items(count);
        allBasketsPrice(price, count);

    }

    public void add(String name, int price, int count, double weight) {
        if (count == 1) {
            add(name, price);
            totalWeight += weight;
        } else {
            add(name, price, count);
            totalWeight = totalWeight + weight * count;
        }
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
