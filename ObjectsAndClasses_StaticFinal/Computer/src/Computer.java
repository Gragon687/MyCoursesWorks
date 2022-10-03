public class Computer {
    public final String vendor;
    public final String name;
    public Cpu cpu;
    public Ram ram;
    public StorageMemory storageMemory;
    public KeyBoard keyBoard;
    public Screen screen;

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public StorageMemory getStorageMemory() {
        return storageMemory;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Screen getScreen() {
        return screen;
    }

    public Computer(String vendor,
                    String name,
                    Cpu cpu,
                    Ram ram,
                    StorageMemory storageMemory,
                    KeyBoard keyBoard,
                    Screen screen) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.storageMemory = storageMemory;
        this.keyBoard = keyBoard;
        this.screen = screen;
    }
    public double totalWeight(){
        return cpu.getWeight() +
                ram.getWeight() +
                storageMemory.getWeight() +
                keyBoard.getWeight() +
                screen.getWeight();
    }
    public Computer setVendor(String vendor){
        return new Computer(vendor, name, cpu, ram, storageMemory, keyBoard, screen);
    }
    public Computer setName(String name){
        return new Computer(vendor, name, cpu, ram, storageMemory, keyBoard, screen);
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setStorageMemory(StorageMemory storageMemory) {
        this.storageMemory = storageMemory;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Компьютер: " + "\n" +
                "Производитель - " + vendor + "\n" +
                "Название - " + name + "\n" +
                cpu.toString() + "\n" +
                ram.toString() + "\n" +
                storageMemory.toString() + "\n" +
                screen.toString() + "\n" +
                keyBoard.toString() + "\n";
    }
}
