package execacao15.customexceptions;

public class PessoaFuncionarioSobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        f.salvar(); //não tem nenhum erro pois sobrescrevemos o método
        //p.salvar(); //vai dar erro pois está jogando uma exceção
    }
}
