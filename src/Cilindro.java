public class Cilindro extends FigurasSolidas {
    public Cilindro(double base, double altura, double radio) {
        super(base, altura, radio);
    }

    @Override
    public double CalcularPerimetro() {
        return 0;
    }

    @Override
    public double CalcularArea() {
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
    }
}
