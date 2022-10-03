public class StorageMemory {
    public final StorageMemoryType type;
    public final int amount;
    public final double weight;

    public StorageMemory setType(StorageMemoryType type){
        return new StorageMemory(type, amount, weight);
    }
    public StorageMemory setAmount(int amount){
        return new StorageMemory(type, amount, weight);
    }
    public StorageMemory setWeight(double weight){
        return new StorageMemory(type, amount, weight);
    }

    public StorageMemoryType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    public StorageMemory(StorageMemoryType type, int amount, double weight) {
        this.type = type;
        this.amount = amount;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Накопитель информации: " + "\n" +
                "Тип - " + type + "\n" +
                "Объем - " + amount + "\n" +
                "Вес - " + weight + "\n";
    }
}
