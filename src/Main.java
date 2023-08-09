public class Main {
    public static void main(String[] args) {
//
        Cuadrado c = new Cuadrado(10, 10);
        Triangulo t = new Triangulo(10, 20, 3, 4, 5);
        Cilindro Cr = new Cilindro(10,20, 20);
        Cubo Cb= new Cubo(10,20,20);


        System.out.println("\nEl area del cuadrado es:" + c.calcularArea());
        System.out.println("El perimetro del cuadrado es:" + c.calcularPerimetro());

        System.out.println("\nEl area del Triangulo es:" + t.calcularArea());
        System.out.println("El Perimetro del Triangulo es:" + t.calcularPerimetro());

        System.out.println("\nEl area del cilindro es:" + Cr.CalcularArea());

        System.out.println("\nEl area del cubo es:"+ Cb.CalcularArea());
        System.out.println("El perimetro del cubo es:"+ Cb.CalcularPerimetro());


    }
}