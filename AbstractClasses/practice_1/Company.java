import java.util.*;

public class Company{
    private int income;
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public Company(int income) {
        if (income > 0)
            this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(int income) {
        if (income > 0)
            this.income = income;
    }

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees){
        for (Employee employee : employees){
            hire(employee);
        }
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }


    public List<Employee> getTopSalaryStaff(int count){
        if (count > 0 && count < employees.size()) {
            Collections.sort(employees);
            Collections.reverse(employees);
            return employees.subList(0, count);
        }
        return new ArrayList<>();
    }

    public List<Employee> getLowestSalaryStaff(int count){
        if (count > 0 && count < employees.size()) {
            Collections.sort(employees);
            return employees.subList(0, count);
        }
        return new ArrayList<>();
    }
}
