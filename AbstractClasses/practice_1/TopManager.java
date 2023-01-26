public class TopManager implements Employee{
    int salary;
    private int fixSalary = 40000;

    public TopManager(Company company){
        if (company.getIncome() > 10_000_000){
            salary = (int) (fixSalary + (fixSalary * 1.5));
        } else {
            salary = fixSalary;
        }
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

}
