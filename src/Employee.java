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

    @Override
    public String toString() {
        return "id = " + id + ", " +
                "fullName = " + fullName + ", " +
                " department = " + department +
                ", salary = " + salary;
    }
}