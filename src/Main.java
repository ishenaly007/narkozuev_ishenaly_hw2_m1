import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(isGoodDay(23, 23));
        System.out.println(isGoodDay(13, 26));
        System.out.println(isGoodDay(48, 16));
        System.out.println(isGoodDay(16, 33));
        System.out.println(isGoodDay(7, 46));

        System.out.println(isGoodDay(generateRandomAge(), 43));
        System.out.println(isGoodDay(generateRandomAge(), -10));
        System.out.println(isGoodDay(generateRandomAge(), -20));
        System.out.println(isGoodDay(generateRandomAge(), 3));
    }

    public static String isGoodDay(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Сидите дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(80);
    }
}