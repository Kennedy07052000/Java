package blocodeinicializacao5.classes;

public class Cliente {
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1; i <= 100; i++){
            parcelas[i -1] = i;
        }
    }

    public Cliente(){

    }

    public int[] getParcelas() {
        return this.parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }


}
