public class Main {
    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Петров Евгений Васильевич", 1, 60000);
        employee[1] = new Employee("Леженин Людмила Валерьевна", 2, 70000);
        employee[2] = new Employee("Жукова Марина Анатольевна", 3, 80000);
        employee[3] = new Employee("Сидоров Максим Максимович", 4, 90000);
        employee[4] = new Employee("Максимов Максим Максимович", 5, 100000);
        employee[5] = new Employee("Иванов Иван Иванович", 1, 65000);
        employee[6] = new Employee("Захаров Виталя Романович", 2, 75000);
        employee[7] = new Employee("Сухоруков Виктор Данилович", 3, 85000);
        employee[8] = new Employee("Куторкин Евгений Анатольевич", 4, 95000);
        employee[9] = new Employee("Зотов Вадим Кириллович", 5, 105000);
        listOfEmployees();
        System.out.println("Сумма ЗП сотрудников " + totalSpent());
        System.out.println("Сотрудник с минимальной ЗП " + minimumWage());
        System.out.println("Сотрудник с максимальной ЗП " + maximumWage());
        System.out.println("Средняя ЗП сотрудников " + averageSalary());
        printFullNames();
    }

    private static void listOfEmployees() {
        for (Employee employees : employee) {
            System.out.println(employees);

        }
    }

    private static int totalSpent() {
        int sum = 0;
        for (Employee employees : employee) {
            sum += employees.getSalary();
        }
        return sum;
    }

    private static Employee minimumWage() {
        Employee employeeWithMinSalary = null;
        for (Employee employees : employee) {
            if (employeeWithMinSalary == null || employees.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee maximumWage() {
        Employee employeeWithMaxSalary = null;
        for (Employee employees : employee) {
            if (employeeWithMaxSalary == null || employees.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double averageSalary() {
        return (double) totalSpent() / employee.length;
    }

    private static void printFullNames() {
        for (Employee employees : employee) {
            System.out.println(employees.getFullName());
        }
    }

    public static void indexation() {
        for (int i = 0; i < employee.length; i++) {
            employee[i].setSalary((int) (employee[i].getSalary() + employee[i].getSalary() * 0.15));

        }
    }
}









