public class ejercicio2 {
    public static void main(String[] args) throws Exception {

        double radio = 100;

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El radio es: " + radio);
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}