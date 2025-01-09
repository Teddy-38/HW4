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
        System.out.println("Task 3");
        int scor = 80;
        if (scor < 60) {
            System.out.println("Если скорость " +scor+ " то, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " +scor+ " то, придеться заплатить штраф");}
        System.out.println("Task 4");
        int ageKind = 30;
        if (ageKind >= 2 && ageKind <= 6) {
            System.out.println("Если возраст человека равен " +ageKind+ " то ему нужно ходить в детский сад");
        }
        if (ageKind >= 7 && ageKind <= 17) {
            System.out.println("Если возраст человека равен " +ageKind+ " то ему нужно ходить в школу");
        }
        if (ageKind >= 18 && ageKind <= 24) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить в университет");
        }
        if (ageKind > 24) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить на работу");
        }
        System.out.println("Task 5");
        int ageBaby = 10;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " +ageBaby+ " то ему нельзя кататься на атракционне");
        }
        if (ageBaby > 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " +ageBaby+ " то ему можно кататься на атракционне в сопровождении");
        }
        if (ageBaby > 14) {
            System.out.println("Если возраст ребенка равен " +ageBaby+ " то ему можно кататься на атракционне без сопровождения");
        }
    }
}