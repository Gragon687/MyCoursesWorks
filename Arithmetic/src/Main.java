public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(5, 4);

        int sum = arithmetic.sum();
        int multi = arithmetic.multi();
        int max = arithmetic.max();
        int min = arithmetic.min();

        System.out.println(sum + "\n"
                + multi + "\n"
                + max + "\n"
                + min);
    }
}
