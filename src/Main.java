public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task5() {
        double pr = 0.007;
        double salary = 15_000;
        int month = 0;

        while (salary < 12_000_000) {
            double n = salary * pr;
            salary = salary + n;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма вклада равна: " + salary);
            }
        }
    }

    private static void task4() {
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total/100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Мемяц " + i + " итого " + total);
            }
            }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int n = 1;
        while (n <= 10) {
            System.out.print(n++ + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i );
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        double salary = 15_000;
        double month = 0;
        int i = 0;
        while (month < 2_459_000) {
            month = month + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений " + month + " рублей");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            System.out.println(total);
        }
    }}