

public class Main {



    public static void main(String[] args) {


        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Лаптев Андрей Сергеевич", 1, 300_000);
        employees[1] = new Employee("Факторович Изабелла Евгеньевна", 2, 150_000);
        employees[2] = new Employee("Прохоренкова Элина Алексеевна", 3, 100_000);
        employees[3] = new Employee("Исаева Наталия Анатольевна", 1, 5_000);
        employees[4] = new Employee("Шашилова Елена Бронислововна", 4, 50_000);
        employees[5] = new Employee("Караулова Анна Витальевна", 2, 20_000);
        employees[6] = new Employee("Савицкая Мария Владимировна", 3, 700_000);
        employees[7] = new Employee("Горбатенко Анна Михайловна", 4, 60_000);
        employees[8] = new Employee("Петров Денис Сергеевич", 5, 50_000);
        employees[9] = new Employee("Макаров Артём Артёмович", 5, 2_000);


        // Базовая сложность

        printSeparation();
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными. ");
        printEmployeeCount(employees);

        printSeparation();
        System.out.println(" Посчитать сумму затрат на зарплаты в месяц. ");
        sumSalaryPerMonth(employees);

        printSeparation();
        System.out.println( " Найти сотрудника с максимальной зарплатой.");
       printMaximumSalary(employees);

        printSeparation();
        System.out.println( " Найти сотрудника с минимальной  зарплатой.");
        printMinimumSalary(employees);


        printSeparation();
        System.out.println( " Минимальная и максимальная зарплата .");
        printMaximumAndMinimumSalary(employees);


        printSeparation();
        System.out.println(" Среднее значение зарплат. ");
        printAverageSalaryValue(employees);

        printSeparation();
        System.out.println(" Получить Ф. И. О. всех сотрудников. ");
        printFullNameAllEmployees(employees);



    }




    public static void printEmployeeCount(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void sumSalaryPerMonth(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalaryEmployees();

        }
        System.out.println("Сумма затрат на зарплаты в месяц : " + sum + " рублей.");

    }

    public static void  printFullNameAllEmployees(Employee [] employees){
        int i = 0;
        while (i < employees.length){
            System.out.println("Ф.И.О. сотрудника:  " + employees[i].getFullNameOfEmployees());
            i++;
        }
    }


    public static void printMaximumSalary (Employee [] employees) {
        int max = employees[0].getSalaryEmployees();
        int number = 0;
        for (int i = 1; i < employees.length; i ++){
            if(employees[i].getSalaryEmployees() > max){
                number = i;
            }
            }

        System.out.println( " Сотрудник с максимальной зарплатой : " + employees[number] + " рублей.");

    }
    public static void printMinimumSalary (Employee [] employees) {
        int min = employees[0].getSalaryEmployees();
        int number = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryEmployees() < min) {
                number = i;
                min = employees[i].getSalaryEmployees();
            }
        }

        System.out.println(" Сотрудник с минимальной зарплатой : " + employees[number] + " рублей.");

    }
    public static void printMaximumAndMinimumSalary (Employee [] employees) {
        int min1 = employees[0].getSalaryEmployees();
        int max1 = employees[0].getSalaryEmployees();

        for (int i = 1; i < employees.length; i++){
            if(employees[i].getSalaryEmployees() < min1){
                min1 = employees[i].getSalaryEmployees();
            }
            if (employees[i].getSalaryEmployees() > max1){
                max1 = employees[i].getSalaryEmployees();
            }
        }

        System.out.println( " Максимальная зарплата : " +  max1 + " рублей. Минимальная зарплата : " + min1 + " рублей .");

    }

    public static void printAverageSalaryValue(Employee [] employees){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalaryEmployees() / employees.length;
        }
            System.out.println("Среднее значение зарплат : " + sum + " рублей.");

    }
    public static void printSeparation() {
        System.out.println("          **********          ");
    }





}















