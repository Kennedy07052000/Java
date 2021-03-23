package polimorfismo14.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println("Gerendo relatório de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salário desse mês: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//        System.out.println("Gerendo relatório de pagamento para a vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salário desse mês: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) { //Parâmetro genêrico que faz referência a objetos específicos
        System.out.println("Gerendo relatório de pagamento ");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário desse mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario; //estamos fazendo um cast para trazer o PNL que tem em Gerente e não tem em funcionário
            System.out.println("Participação dos lucros: " + g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total vendas: "+v.getTotalVendas());
        }


    }
}
