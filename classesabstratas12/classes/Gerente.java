package classesabstratas12.classes;

public class Gerente extends Funcionaio{
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public void imprime() {

    }
}
