public abstract class FigurasSolidas extends FigurasGeometricas {

    public FigurasSolidas(double base, double altura, double radio) {
        super.base = base;
        super.altura = altura;
        super.radio = radio;
    }

    public abstract double CalcularPerimetro();

    public abstract double CalcularArea();
}
