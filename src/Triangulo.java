public class Triangulo extends FigurasPlanas {
    public Triangulo(double base, double altura, double ladoI, double ladoII, double ladoIII) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {

        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {

        return ladoI + ladoII + ladoIII;
    }
}
