package modificadorestatico6.classes;

public class Cliente {
    private static int[] parcelas;
    static{
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i = 1; i <= 100; i++){
            parcelas[i -1] = i;
        }
    }

    static{
        System.out.println("bloco estatico 2");
    }

    static{
        System.out.println("bloco estatico 3");
    }

    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }


}
