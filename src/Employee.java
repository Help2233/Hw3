import java.util.Objects;

public class Employee {
    private static int idGenerator = 1;

    private final String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setIdGenerator(int idGenerator) {
        Employee.idGenerator = idGenerator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && Double.compare(salary, employee1.salary) == 0 && id == employee1.id && Objects.equals(fullName, employee1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "id = " + id + ", " +
                "fullName = " + fullName + ", " +
                " department = " + department +
                ", salary = " + salary;
    }
}