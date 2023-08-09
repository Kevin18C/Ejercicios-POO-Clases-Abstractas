public class Cubo extends FigurasSolidas {
    public Cubo(double base, double altura, double radio) {
        super(base, altura, radio);
    }

    @Override
    public double CalcularPerimetro() {
        return 12 * base;
    }

    @Override
    public double CalcularArea() {
        return 6 * (base * base);
    }
}
