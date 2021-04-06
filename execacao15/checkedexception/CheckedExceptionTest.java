package execacao15.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        criarArquivo();
    }
                                      //relaçando a execeção
    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado? : "+file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            //IOException é uma execeção que pode acontecer no try, caso coloque uma exceção no catch que não tenha no try vai dar erro.
            e.printStackTrace();//vai apresentar o erro e salvar em um log
            //Não pode colocar dentro de um System.out.print() pois é um método void
            throw e;//tratamos a execeção e estamos relançando a exceção
        }

    }
}
