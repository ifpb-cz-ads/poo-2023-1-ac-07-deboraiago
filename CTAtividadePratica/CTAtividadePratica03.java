import java.util.Locale;
import java.util.Scanner;

/**
 * CTAtividadePratica03
 */
public class CTAtividadePratica03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double [] notas = new double [10];

        for (int i = 0; i < 10 ; i++){
            System.out.println("digite a nota aluno: ");
            notas[i] = sc.nextDouble();
        }
        double soma = 0;
    for (int i = 0; i < 10; i++){
        soma = soma + notas[i];
    }
     double media = soma / 10;
     
     System.out.printf("A media das notas e: %.2f\n " , media);

     int contAprovado = 0;
     int contReprovado = 0;
     for(int i = 0; i<10; i++){
        if(notas[i]<= media){
            contAprovado++; 
        }else {
            contReprovado++;
            }
     }
     System.out.println("A quantidade notas acima da media foi:  " + contAprovado);
     System.out.println("A quantidade nota abaixo da media foi: " + contReprovado);

     sc.close();
    }
}