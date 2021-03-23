package modificadorestatico6.test;


import modificadorestatico6.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();  //Embora tenha 3 objetos só será inicializado uma vez
        Cliente c1 = new Cliente(); //devido o bloco de inicialização static
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis");
//        for(int parcela : c.getParcelas()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("tamanho: "+ Cliente.getParcelas().length);

    }
}
