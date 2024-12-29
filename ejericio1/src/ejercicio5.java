import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();

        double m = random.nextDouble() * 1000;
        double Km = m / 1000;
        double Miles = Km * 0.621371;
        System.out.println("m: " + m);
        System.out.println("Km: " + Km);
        System.out.println("Miles: " + Miles);
        System.out.println(m + " metros equivale a " + Miles + " millas");
    }
}
