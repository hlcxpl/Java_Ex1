import java.util.Random;

public class ejericio6 {
    public static void main(String[] args) {
        Random random = new Random();
        double Centigrados = random.nextDouble() * 100;
        double Fahrenheit2 = random.nextDouble() * 100;

        double Fahrenheit = (Centigrados * 1.8) + 32;
        double Centigrados2 = (Fahrenheit2 - 32) / 1.8;
        System.out.println(Centigrados + " centigrados son: " + Fahrenheit + " Fahrenheit");
        System.out.println(Fahrenheit2 + " Fahrenheit son: " + Centigrados2 + " Centigrados");
    }
}
