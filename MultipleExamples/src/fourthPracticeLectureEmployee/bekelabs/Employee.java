package fourthPracticeLectureEmployee.bekelabs;

public class Employee {

    private String name;
    private int salary;

    public Employee()
    {

    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long increaseSalary(int increase) {
        return this.salary+=increase;
    }


    public String employeeData() {
        return "Salary: "+this.salary+ " Name: "+ this.name;
    }

    public boolean isInSalaryRange(long salaryStart, long salaryEnd) {

        if (this.salary<salaryEnd && this.salary>=salaryStart) {
            return true;
        }
        else return false;
    }

    public long getTax() {
        return (long) (this.salary*0.16);
    }

    public boolean hasHigherSalary(Employee employee) {
        if (this.salary>employee.salary) {
            return true;
        }else return false;
    }




}