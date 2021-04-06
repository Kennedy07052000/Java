package execacao15.runtimeexception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw  new ArrayIndexOutOfBoundsException(); //jogando uma exceção
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){// se colocamos essa esseçãp acima vai dar erro, pois ela é mais genérica que ArrayIndexOutOfBoundsException, ela é pai da ArrayIndexOutOfBoundsException
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        System.out.println("Final do programa");


        //Podmeos colcoar tudo dentro de um catch
        try{
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            // Não podemos colcoar classes que estão na mesma linha de henrança.
            // Ex se colocar assim:  catch (SQLException | FileNotFoundException  | IOException e) vai dar erro pois FileNotFoundException é subclasse de IOException
        }

        //Exception
        try{
            talvezLanceException();
        }catch (Exception e){
           //Exception é a classe pai das exceções, então vai pegar "todas" exceções sem precisar ficar especificando
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}

// Para saber se a exceção é subclasse basta segurar CTRL + ALT + CLICAR EM CIMA DA EXCEÇÃO