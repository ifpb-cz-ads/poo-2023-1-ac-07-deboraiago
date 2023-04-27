import java.util.Scanner;

public class CBBAtividaPratica6 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int [] numeros = new int [10];

        for (int i = 0; i < 10; i++){
     
            System.out.println("digite o numero " );
            numeros [i] = sc.nextInt();
        }

        int maiorNumero = 0;
        for(int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);
            
            if ( numeros[i] >= maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("o maior valor e " + maiorNumero);

        sc.close();
    }
}
