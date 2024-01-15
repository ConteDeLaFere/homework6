public class Main {

    public static void task1(){
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2(){
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3(){
        for (int i = 0; i <= 17; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4(){
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5(){
        for (int i = 1904; i <= 2096; i+=4){
            System.out.printf("%d год является високосным\n", i);
        }
    }

    public static void task6(){
        for (int i = 7; i <= 98; i+=7){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7(){
        for (int i = 1; i <= 512; i*=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8(){
        int sum = 0;
        int moneyPerMonth = 29000;
        for (int i = 1; i <= 12; i++){
            sum += moneyPerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, sum);
        }
    }
    public static void task9(){
        double sum = 0;
        int moneyPerMonth = 29000;
        for (int i = 1; i <= 12; i++){
            sum += 1.01 * moneyPerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, sum);
        }
    }

    public static void task10(){
        int two = 2;
        for (int i = 1; i <= 10; i++){
            int result = two * i;
            System.out.printf("%d*%d=%d\n", two, i, result);
        }
    }

    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
}