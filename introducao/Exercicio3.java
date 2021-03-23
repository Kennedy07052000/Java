package introducao;

public class Exercicio3 {
    public static void main(String[] args) {
        int idade = 18;
        String categoria="";
        if (idade < 15){
            categoria = "infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
