import java.util.Objects;

public class Employee {


    private String fullNameOfEmployees;
    private double salaryEmployees;
    private int id = 0;
    private int departments;

    static int Counter;



    public Employee(String fullNameOfEmployees, int departments, double salaryEmployees) {
        this.fullNameOfEmployees = fullNameOfEmployees;
        this.departments = departments;
        this.salaryEmployees = salaryEmployees;
        id = ++Counter;

    }

    public String getFullNameOfEmployees() {
        return this.fullNameOfEmployees;
    }


    public double getSalaryEmployees() {
        return this.salaryEmployees;
    }

    public void setSalaryEmployees(double salaryEmployees) {
        this.salaryEmployees = salaryEmployees;
    }

    public int getId() {
        return this.id;

    }


    public int getDepartments() {
        return this.departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }


    @Override
    public String toString() {
        return "Id" + this.id + " Ф.И.О. сотрудника : " + this.fullNameOfEmployees + " Зарплата в месяц: " + this.salaryEmployees + " демартамент: " + this.departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salaryEmployees, salaryEmployees) == 0 && id == employee.id && departments == employee.departments && fullNameOfEmployees.equals(employee.fullNameOfEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameOfEmployees, salaryEmployees, id, departments);
    }
}