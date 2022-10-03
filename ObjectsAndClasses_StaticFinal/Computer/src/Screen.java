public class Screen {
    public final int diagonal;
    public final ScreenType type;
    public final double weight;

    public Screen setDiagonal(int diagonal){
        return new Screen(diagonal, type, weight);
    }
    public Screen setType(ScreenType type){
        return new Screen(diagonal, type, weight);
    }
    public Screen setWeight(double weight){
        return new Screen(diagonal, type, weight);
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Screen(int diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Экран: " + "\n" +
                "Диагональ - " + diagonal + "\n" +
                "Тип - " + type + "\n" +
                "Вес - " + weight + "\n";
    }
}
