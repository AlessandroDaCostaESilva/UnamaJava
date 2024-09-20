package zoologico;

public class Ave extends Animal{
    private String corPena;

    private void fazNinho(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Override
    public void locomover(){
        System.out.println("Vuando, guris");
    }

    @Override
    public void alimentar(){
        System.out.println("Picando, guris");
    }
}
