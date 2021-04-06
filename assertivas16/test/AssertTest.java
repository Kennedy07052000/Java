package assertivas16.test;

public class AssertTest {
    public static void main(String[] args) {
        calcSalario(-1000);
    }

    private static void calculaSalario(double salario){
        //salário não pode ser negativo, se usarmos o if else pode dar pois, pode cair no else
        assert(salario > 0) : "O salário não deve ser menor que zero";// esse valor tem que ser true se for falso tá errado, ou seja, garante que o salário será maior que 0
        //fazer cálculo com salário
    }

    public static void diasDaSemana(int dia){
        switch (dia){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false; //como só existe 7 dias na semana se entrar com 8 por exemplo ele retorna um Assert. lembrando que precisa HABILITAR O ASSERT
                //USAMOS O ASSERT QUANDO TEMOS QUE CERTEZA QUE NÃO PRECISA DE UM ELSE, EX SÃO OS DIAS DA SEMANA, POIS NÃO PODE TER 8 DIAS E SEMPRE 7
        }
    }
    //PRECISAMOS HABILITAR O ASSERT
    //-> RUN -> EDIT cCONFIGURATIOS -> SELECIONA A CLASSE E EM VM -ea

    public static void calcSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException(); //se o salário for menor que 0 ele joa uma exceção
        }
    }
}


//PRECISAMOS HABILITAR O ASSERT
  //-> RUN -> EDIT cCONFIGURATIOS -> SELECIONA A CLASSE E EM VM -ea