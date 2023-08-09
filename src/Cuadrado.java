public class Cuadrado extends FigurasPlanas {
    public Cuadrado(double base, double altura) {

        super(base, altura);
    }

    @Override
    public double calcularArea() {

        return base * altura;
    }

    @Override
    public double calcularPerimetro() {

        return 4 * base;
    }
}
