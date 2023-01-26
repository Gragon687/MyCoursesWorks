import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(12_000_000);
        List<Employee> staff = new ArrayList<>();

        //Нанимаем сотрудников
        for (int i = 0; i < 180; i++){
            company.hire(new Operator());
        }
        for (int i = 0; i < 80; i++){
            staff.add(new Manager());
        }
        for (int i = 0; i < 10; i++){
            staff.add(new TopManager(company));
        }
        company.hireAll(staff);

        //Печать списков зарплат
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
        System.out.println("Самые высокие зарплаты: ");
        for (Employee e : topSalaryStaff){
            System.out.println(e.getMonthSalary());
        }
        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);
        System.out.println("Самые низкие зарплаты: ");
        for (Employee e : lowestSalaryStaff){
            System.out.println(e.getMonthSalary());
        }

        //Увольняем 50% сотрудников
        for (int i = 0; i < 135; i++){
            company.fire(company.getEmployees().get(i));
        }

        //Выводим новые списки зарплат
        System.out.println("СПИСКИ ПОСЛЕ УВОЛЬНЕНИЯ: ");
        topSalaryStaff = company.getTopSalaryStaff(15);
        System.out.println("Самые высокие зарплаты: ");
        for (Employee e : topSalaryStaff){
            System.out.println(e.getMonthSalary());
        }
        lowestSalaryStaff = company.getLowestSalaryStaff(30);
        System.out.println("Самые низкие зарплаты: ");
        for (Employee e : lowestSalaryStaff){
            System.out.println(e.getMonthSalary());
        }
    }
}
