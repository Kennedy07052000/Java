package execacao15.customexceptions;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{

    }
}

//Tomar bastante cuidado com as classes que são super classes, pois se declararmos uma super classe em funcionário, dará erro
//pois essa super classe tem que está em Pessoa e as sub classes em funcionário