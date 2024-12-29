import java.util.Random;

public class ejericio7 {
    public static void main(String[] args) {
        Random random = new Random();

        double x1 = random.nextDouble() * 100;
        double y1 = random.nextDouble() * 100;

        double x2 = random.nextDouble() * 100;
        double y2 = random.nextDouble() * 100;

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Punto 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Punto 2: (" + x2 + ", " + y2 + ")");
        System.out.println("La distancia euclidiana entre los puntos es: " + distancia);
    }
}
