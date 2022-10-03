public class Ram {
    public final RamType type;
    public final int amount;
    public final double weight;

    public Ram setType(RamType type){
        return new Ram(type, amount, weight);
    }
    public Ram setAmount(int amount){
        return new Ram(type, amount, weight);
    }
    public Ram setWeight(double weight){
        return new Ram(type, amount, weight);
    }

    public RamType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    public Ram(RamType type, int amount, double weight) {
        this.type = type;
        this.amount = amount;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Оперативная память:" + "\n" +
                "Тип памяти - " + type + "\n" +
                "Объем - " + amount + "\n" +
                "Вес - " + weight +"\n";
    }
}
