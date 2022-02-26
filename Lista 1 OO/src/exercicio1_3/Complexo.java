package exercicio1_3;

public class Complexo
{
    private double a;
    private double b;

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public Complexo(double aParam, double bParam)
    {
        this.a = aParam;
        this.b = bParam;
    }

    public void soma(Complexo complexo)
    {
        Double somaReal = this.a + complexo.getA();
        Double somaImaginaria = this.b + complexo.getB();

        System.out.println("Soma da Parte Real: "+somaReal);
        System.out.println("Soma da Parte Imaginária: "+somaImaginaria);
    }

    public String toString()
    {
        return "(" + this.a + ", " + this.b + ")";
    }
}
