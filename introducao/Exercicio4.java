package introducao;

public class Exercicio4 {
    public static void main(String[] args) {
        double salario = 5500;
        double imposto;
        if(salario < 1000){
            imposto = salario * 0.05;
        }else if(salario >= 1000 && salario < 2000){
            imposto = salario * 0.1;
        }else if(salario >= 2000 && salario < 4000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.2;
        }
        System.out.println("O imposto é "+imposto);
    }
}
