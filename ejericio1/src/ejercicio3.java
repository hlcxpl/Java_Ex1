
public class ejercicio3 {
    public static void main(String[] args) {
        double r = 100;
        double h = 100;
        double b = Math.PI * (Math.pow(r, 2));
        double AL = 2 * Math.PI * r * h;
        double AT = AL + (2 * b);
        double volume = b * h;
        System.out.println("El volumen es: " + volume);
        System.out.println("La área lateral es: " + AL);
        System.out.println("La área transversal es: " + AT);
    }
}
