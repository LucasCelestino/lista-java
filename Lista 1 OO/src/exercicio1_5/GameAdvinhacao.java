package exercicio1_5;

public class GameAdvinhacao
{
    private double numero;

    public void sortear()
    {
        this.numero = Math.round(Math.random() * 99);
    }

    public void advinhar()
    {
        double numeroAdvinhado = Math.round(Math.random() * 99);

        if(numeroAdvinhado == this.getNumero())
        {
            System.out.print("Acertou!! o número sorteado foi "+this.getNumero());
        }
        else
        {
            System.out.print("Errou... o número sorteado foi "+this.getNumero()+" e você escolheu o número "+numeroAdvinhado);
        }
    }

    public double getNumero()
    {
        return this.numero;
    }
}
