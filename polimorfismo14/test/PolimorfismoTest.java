package polimorfismo14.test;

import polimorfismo14.classes.Funcionario;
import polimorfismo14.classes.Gerente;
import polimorfismo14.classes.RelatorioPagamento;
import polimorfismo14.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("----------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("----------------------------");
        relatorio.relatorioPagamentoGenerico(v);
        //Funcionario f = g;//funcionario recebe gerente, ambos estão apontando para a classe gerente
        //ystem.out.println("$$$$$$$$$$$$$$");
        //System.out.println(f.getSalario());
    }
}
