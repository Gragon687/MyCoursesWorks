public class Cpu {
    public final double cpuFrequency;
    public final int coresNum;
    public  final String manufacturer;
    public final double weight;

    public Cpu setCpuFrequency(double cpuFrequency){
        return  new Cpu(cpuFrequency, coresNum, manufacturer, weight);
    }
    public Cpu setCoresNum(int coresNum){
        return  new Cpu(cpuFrequency, coresNum, manufacturer, weight);
    }
    public Cpu setManufacturer(String manufacturer){
        return  new Cpu(cpuFrequency, coresNum, manufacturer, weight);
    }
    public Cpu setWeight(double weight){
        return  new Cpu(cpuFrequency, coresNum, manufacturer, weight);
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public int getCoresNum() {
        return coresNum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public Cpu(double cpuFrequency, int coresNum, String manufacturer, double weight) {
        this.cpuFrequency = cpuFrequency;
        this.coresNum = coresNum;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Процессор: " + "\n" +
                "Частота процессора - " + cpuFrequency + "\n" +
                "Колличество ядер - " + coresNum + "\n" +
                "Производитель - " + manufacturer + "\n" +
                "Вес - " + weight + "\n";
    }
}
