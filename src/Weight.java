


//   Сила тяжести на Луне примерно равна 17%,
// напишите программу,
// которая вычисляет ваш вес на Луне.


import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Еnter your weight on the planet Earth");
        int weight = scanner.nextInt();
        double moon = 0.17;
        Double weightMoon = weight*moon;
        System.out.println();
        System.out.println("Your weight on the moon is equal " + weightMoon + " kg");
    }
}
