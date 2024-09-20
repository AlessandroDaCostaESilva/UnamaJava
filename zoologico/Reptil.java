package zoologico;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando, guris");
    }

    @Override
    public void alimentar(){
        System.out.println("Inseto");
    }
}
