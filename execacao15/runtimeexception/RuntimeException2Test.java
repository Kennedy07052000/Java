package execacao15.runtimeexception;

public class RuntimeException2Test {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        double result = num1/num2;
        System.out.println(result);
    }
}
