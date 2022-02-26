package exercicio1_1;

public class Churrasco
{
    private double qtdCarne;

    public void verificarConsumo(Pessoa pessoa)
    {
        if(pessoa.getIdade() <= 3 || pessoa.isVegetariana())
        {
            this.qtdCarne = 0;
            System.out.println("Consumo de Carne(kg): "+this.getQtdCarne());
        }
        else if(pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12)
        {
            this.qtdCarne = 1;
            System.out.println("Consumo de Carne(kg): "+this.getQtdCarne());
        }
        else
        {
            this.qtdCarne = 2;
            System.out.println("Consumo de Carne(kg): "+this.getQtdCarne());
        }
    }

    public double getQtdCarne() {
        return this.qtdCarne;
    }
}
