package exercicio1_6;

public class Eq2Grau
{
    private double a,b,c,delta;
    
    public Eq2Grau(double aParam, double bParam, double cParam)
    {
        this.a = aParam;
        this.b = bParam;
        this.c = cParam;
    }

    public double delta()
    {
        this.delta = (this.b * this.b) - 4 * (this.a * this.c);

        return this.delta;
    }

    public double raiz1()
    {
        if(this.delta() >= 0)
        {
            double x1 = ( (-this.b) - Math.sqrt(this.delta()) ) / 2 * a;
            return x1;
        }
        else
        {
            return 0;
        }
    }

    public double raiz2()
    {
        if(this.delta() >= 0)
        {
            double x2 = ( (-this.b) + Math.sqrt(this.delta()) ) / 2 * a;
            return x2;
        }
        else
        {
            return 0;
        }
    }
}
