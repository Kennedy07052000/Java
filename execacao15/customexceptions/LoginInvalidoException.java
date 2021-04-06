package execacao15.customexceptions;

//Própria exceção
public class LoginInvalidoException extends  Exception{

    //Criar construtor para dar uma mensagem
    public LoginInvalidoException(){
        super("Usuário ou senha inválidos");
    }

}
