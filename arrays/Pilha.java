package arrays;

public class Pilha {
    private int[] valores;
    private int topo;
    public int tamanho;

    public Pilha(int tamanho){
        this.valores = new int[tamanho];
        this.topo = -1;
        this.tamanho = tamanho;
    }

   public void push(int valor) {
    if (isFull()) {
        System.out.println("Pilha cheia");

        return;
    }
    topo++;
    valores[topo] = valor;
}

public int pop() {
    if (isEmpty()) {
        System.out.println("Pilha vazia");
        
        return - 1;
    }
    int valor = valores[topo];
    topo--;
    return valor;
}
public int peek() {
    if (isEmpty()) {
        System.out.println("Pilha vazia");

        return -1;
    }
    return valores[topo];
}

public boolean isEmpty() {
    return topo == -1;
}

public boolean isFull() {
    return topo == tamanho -1;
}

}