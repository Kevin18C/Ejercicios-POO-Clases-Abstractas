public abstract class FigurasPlanas extends FigurasGeometricas {
    public FigurasPlanas(double base, double altura, double ladoI, double ladoII, double ladoIII) {
        super.base = base;
        super.altura = altura;
        super.ladoI = ladoI;
        super.ladoII = ladoII;
        super.ladoIII = ladoIII;
    }

    public FigurasPlanas(double base, double altura) {
        super();
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
