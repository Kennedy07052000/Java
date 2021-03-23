package Heranca8.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    static {
        System.out.println("Bloco de inicialização de estático de pessoa ");
    }

    {
        System.out.println("Bloco de inicialização de funcionarios de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionarios de pessoa 2");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeRebiboPagamento();
    }

    public void imprimeRebiboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
