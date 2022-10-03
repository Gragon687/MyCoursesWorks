public class KeyBoard {
    public final KeyBoardType type;
    public final IsBacklight backlight;
    public final double weight;

    public KeyBoard setType(KeyBoardType type){
        return new KeyBoard(type, backlight, weight);
    }
    public KeyBoard setBacklight(IsBacklight backlight){
        return new KeyBoard(type, backlight, weight);
    }
    public KeyBoard setWeight(double weight){
        return new KeyBoard(type, backlight, weight);
    }

    public KeyBoardType getType() {
        return type;
    }

    public IsBacklight getBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }

    public KeyBoard(KeyBoardType type, IsBacklight backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Клавиатура: " + "\n" +
                "Тип - " + type + "\n" +
                "Подсветка - " + backlight + "\n" +
                "Вес - " + weight + "\n" ;
    }
}
