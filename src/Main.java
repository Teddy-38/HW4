public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать еще немного");
        }
        System.out.println("Task 2");
        int temp = 8;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("Task 3");
        int scor = 80;
        if (scor < 60) {
            System.out.println("Если скорость " + scor + " то, можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + scor + " то, придеться заплатить штраф");
        }
        System.out.println("Task 4");
        int ageKind = 30;
        if (ageKind >= 2 && ageKind <= 6) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить в детский сад");
        }
        if (ageKind >= 7 && ageKind <= 17) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить в школу");
        }
        if (ageKind >= 18 && ageKind <= 24) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить в университет");
        }
        if (ageKind > 24) {
            System.out.println("Если возраст человека равен " + ageKind + " то ему нужно ходить на работу");
        }
        System.out.println("Task 5");
        int ageBaby = 7;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " то ему нельзя кататься на атракционне");
        }
        if (ageBaby > 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " то ему можно кататься на атракционне в сопровождении");
        }
        if (ageBaby > 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " то ему можно кататься на атракционне без сопровождения");
        }
        System.out.println("Task 6");
        int wag = 40;
        if (wag < 60) {
            System.out.println("В вагоне есть сидячии места");
        } else if (wag > 60 && wag < 102) {
            System.out.println("В вагоне нет сидячих мест");
            } else {
            System.out.println("В вагоне нет мест");
        }
            System.out.println("Task 7");
        int one = 1;
        int two = 5;
        int three = 8;

        boolean oneBig = one > two && one > three;
        boolean twoBig = two > one && two > three;

        if (oneBig) {
            System.out.println("Число один - наибольшее из всех.");
        } else if (twoBig){
            System.out.println("Число два - наибольшее из всех.");
        } else {
            System.out.println("Число три - наибольшее из всех.");
        }
    }
}