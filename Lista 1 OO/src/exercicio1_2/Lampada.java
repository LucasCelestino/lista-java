package exercicio1_2;

public class Lampada
{
    private boolean estadoAtual = false;
    private int qtdClicks;

    public Lampada(int qtdClics)
    {
        this.qtdClicks = qtdClics;
    }

    public void verificarEstado()
    {
        if(estadoAtual == true)
        {
            System.out.println("A lâmpada está ligada! - Quantidade de clicks restantes: "+this.qtdClicks);
        }
        else if(this.qtdClicks == 0)
        {
            System.out.println("A lâmpada quebrou, não é possível ligar mais. - Quantidade de clicks restantes: "+this.qtdClicks);
        }
        else
        {
            System.out.println("A lâmpada está desligada! - Quantidade de clicks restantes: "+this.qtdClicks);
        }
    }

    public void trocarEstadoAtual()
    {
        this.diminuirClicksLampada();

        if(this.qtdClicks > 0)
        {
            if(estadoAtual == true)
            {
                estadoAtual = false;
            }
            else
            {
                estadoAtual = true;
            }
        }
        else
        {
            estadoAtual = false;
        }
    }

    private void diminuirClicksLampada()
    {
        if(this.qtdClicks < 0)
        {
            this.qtdClicks = 0;
        }
        else
        {
            this.qtdClicks--;
        }
    }
}

// trocarEstadoAtual() clicks = 1
// verificarEstadoAtual() ---
// trocarEstadoAtual() clicks = 0
