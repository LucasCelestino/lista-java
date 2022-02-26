package exercicio1_1;

public class Pessoa
{
    private String nome;
    private SexoEnum sexo;
    private int idade;
    private boolean vegetariana;

    public Pessoa(String nome, SexoEnum sexo, int idade, boolean vegetariana)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }

    public String getNome() {
        return this.nome;
    }

    public SexoEnum getSexo() {
        return this.sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean isVegetariana() {
        return this.vegetariana;
    }
}
