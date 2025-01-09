public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать еще немного");}
        System.out.println("Task 2");
        int temp = 8;
        if (temp < 5) {
            System.out.println("На улице " +temp+ " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " +temp+ " градусов, можно идти без шапки");}
    }
}