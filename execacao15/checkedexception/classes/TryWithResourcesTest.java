package execacao15.checkedexception.classes;

import execacao15.checkedexception.classes.Leitor1;
import execacao15.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo(); //chamando a classe onde foi feita o Override de um método para que seja fechado no final da execução
    }

    //EXEMPLO
    public static void lerArquivo() {
        // Nesse código vai acontecer a leitura do arquivo e o próprio java vai fechar
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //HOJE EM DIA
    public static void lerArquivoNew() {
        // Nesse código vai acontecer a leitura do arquivo e o próprio java vai fechar
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //FEITO "ANTIGAMENTE"
    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt")); //leitura de um arquivo, precisamos sempre fechar o arquivo
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); //fechando o arquivo
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
