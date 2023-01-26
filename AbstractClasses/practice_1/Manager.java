public class Manager implements Employee{
    private int salary;
    private int fixSalary = 20000;

    public Manager(){
        int MAX_BONUS = 140000;
        int MIN_BONUS = 115000;
        salary = (int) ((((Math.random()*(MAX_BONUS - MIN_BONUS)) + MIN_BONUS) * 1.05) + fixSalary);
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }


}
