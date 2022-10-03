public class Main {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(3000, 8, "Intel", 400);
        Ram ram1 = new Ram(RamType.DDR4, 16, 100);
        StorageMemory storageMemory1 = new StorageMemory(StorageMemoryType.SSD, 256, 357);
        Screen screen1 = new Screen(27, ScreenType.IPS, 2545);
        KeyBoard keyBoard1 = new KeyBoard(KeyBoardType.MECHANICAL, IsBacklight.YES, 1545);

        Cpu cpu2 = new Cpu(1200, 6, "AMD", 387);
        Ram ram2 = new Ram(RamType.DDR2, 4, 86);
        StorageMemory storageMemory2 = new StorageMemory(StorageMemoryType.HDD, 1024, 380);
        Screen screen2 = new Screen(23, ScreenType.VA, 2315);
        KeyBoard keyBoard2 = new KeyBoard(KeyBoardType.MEMBRANE, IsBacklight.YES, 889);

        Computer computer1 = new Computer("HyperX",
                "Game",
                cpu1,
                ram1,
                storageMemory1,
                keyBoard1,
                screen1);
        Computer computer2 = new Computer("Aser",
                "Work",
                cpu2,
                ram2,
                storageMemory2,
                keyBoard2,
                screen2);
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        computer2.setCpu(cpu1);
        System.out.println(computer2.toString());
        System.out.println("Вес компьютера " + computer1.getName() + " = " +computer1.totalWeight());
    }
}
