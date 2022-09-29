import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(10, 15, 5);
        Cargo cargo = new Cargo(dimensions,
                205,
                "ул.Советская, 35",
                true,
                "bs2237232",
                false);
        cargo.getCargo();
        Dimensions dimensions1 = dimensions.setLenght(45);
        Cargo cargo1 = cargo.setAdress("ул.Гагарина, 47");
        cargo1 = cargo1.setDimension(dimensions1);
        cargo1.getCargo();

    }
}
