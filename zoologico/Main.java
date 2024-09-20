package zoologico;

public class Main {
    public static void main(String[] args) {
        Mamifero mm = new Mamifero();
        mm.setPeso(20.3);
        System.out.println(mm.getPeso());
        mm.locomover();

        Ave aa = new Ave();
        aa.setPeso(11.3);
        System.out.println(aa.getPeso());
        aa.locomover();

        Reptil rr = new Reptil();
        rr.setPeso(33.1);
        System.out.println(rr.getPeso());
        rr.locomover();
    }
}
