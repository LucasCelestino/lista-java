package exercicio1_4;

public class TrianguloEquilatero
{
    private double lado;
    private double perimetro;
    private double area;

    public TrianguloEquilatero(double lado)
    {
        this.lado = lado;
    }

    public void calcArea()
    {
        this.area = this.lado * (Math.sqrt(3) / 2);
    }

    public void calcPerimetro()
    {
        this.perimetro = 3 * this.lado;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }
}
