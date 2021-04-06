package execacao15.customexceptions;

import execacao15.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar(); //chamando o método
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    //vai jogar a exceção criada
    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        //Se usuario for diferente...
        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException(); // se usuário ou senha estiver errado ele joga a exceção criada com a menssagem "Usuário ou senha inválida"
        } else {
            System.out.println("Logado");
        }

    }
}
