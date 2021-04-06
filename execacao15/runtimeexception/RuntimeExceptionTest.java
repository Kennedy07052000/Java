package execacao15.runtimeexception;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        if(b != 0){
//            int c = a/b;
//            System.out.println(a);
//        }
        try {
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("Imprimindo depois da possível exceção");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Fora do bloco catch");


    }
}
