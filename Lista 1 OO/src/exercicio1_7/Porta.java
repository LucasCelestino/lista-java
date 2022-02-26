package exercicio1_7;

public class Porta
{
    private boolean isOpen;
    private int numAberturas;

    public void abrir()
    {
        if(!this.isOpen)
        {
            this.isOpen = true;
            System.out.print("Abriu a porta.");
        }

        this.numAberturas++;
    }

    public void fechar()
    {
        if(this.isOpen)
        {
            this.isOpen = false;
            System.out.print("Fechou a porta.");
        }
    }

    public int getNumAberturas()
    {
        return this.numAberturas;
    }
}
