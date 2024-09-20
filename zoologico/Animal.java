package zoologico;

public class Animal {
    private double peso;
    private int idade;
    private int membros;

    public void locomover(){
        System.out.println("Eu odeio Java");
    }

    public void alimentar(){
        System.out.println("Eu odeio java (Alimentação)");
    }

    public double getPeso(){    
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;

    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getMembro(){
        return membros;
    }

    public void setMembros(int membros){
        this.membros = membros;
    }
}

