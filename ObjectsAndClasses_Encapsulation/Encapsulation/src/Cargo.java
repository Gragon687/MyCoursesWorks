public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final boolean canBeTurned;
    private final String registerNumber;
    private final boolean fragile;

    public int getDimensions() {
        return dimensions.size();
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isCanBeTurned() {
        return canBeTurned;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public Cargo(Dimensions dimensions,
                 int weight,
                 String address,
                 boolean canBeTurned,
                 String registerNumber,
                 boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.canBeTurned = canBeTurned;
        this.registerNumber = registerNumber;
        this.fragile = fragile;
    }
    public Cargo setAdress(String address){
        return new Cargo(dimensions, weight, address, canBeTurned, registerNumber, fragile);
    }
    public Cargo setDimension(Dimensions dimensions){
        return new Cargo(dimensions, weight, address, canBeTurned, registerNumber, fragile);
    }
    public  Cargo setWeight(int weight){
        return new Cargo(dimensions, weight, address, canBeTurned, registerNumber, fragile);
    }
    public void getCargo(){
        System.out.println("Объем: " + getDimensions() + "\n" +
                "Адрес: " + getAddress() + "\n" +
                "Вес: " + getWeight() + "\n" +
                "Регистрационный номер: " + getRegisterNumber() + "\n" +
                "Хрупкий: " + isFragile() + "\n" +
                "Можно ли переворачивать: " + isCanBeTurned() + "\n");
    }

}
