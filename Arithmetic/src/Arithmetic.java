public class Arithmetic {
    private int firstNum;
    private int secondNum;
    public Arithmetic(int first, int second){
        firstNum = first;
        secondNum = second;
    }
    public int sum(){
        return firstNum + secondNum;
    }
    public int multi(){
        return firstNum * secondNum;
    }
    public int max(){
        int max = (firstNum > secondNum) ? firstNum : secondNum;
        return max;
    }
    public int min(){
        int min = (firstNum < secondNum) ? firstNum : secondNum;
        return min;
    }

}
