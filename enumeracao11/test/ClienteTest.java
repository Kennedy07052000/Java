package enumeracao11.test;

import enumeracao11.classes.Cliente;
import enumeracao11.classes.TipoCliente;
import enumeracao11.classes.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, TipoPagamento.AVISTA);
        System.out.println(cliente);
    }
}
