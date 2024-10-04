package estruturaDeDados;

public class ArrasyXListas {
    public static void main(String[] args) {
        int[] odeioJava = new int[10];
        for(int a : odeioJava){
            odeioJava[a] = odeioJava[a] + 5;
            System.out.println(odeioJava[a]);
        }
    }
}