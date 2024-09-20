package zoologico;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover(){
        System.out.println("Passiando, guris");
    }

    @Override
    public void alimentar(){
        System.out.println("Toma leite");
    }
}
