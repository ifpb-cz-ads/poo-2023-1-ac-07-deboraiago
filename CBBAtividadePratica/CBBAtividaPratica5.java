

public class CBBAtividaPratica5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        String [] dias = new String []  {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        while(i <= 6){
            System.out.println(dias[i]);
            i++;
        }

        System.out.println("________________________________________");

        do{
            System.out.println(dias[j]);
            j ++;
        }while(j <= 6) ;

        System.out.println("___________________________________________");

        for (int f = 0; f <= dias.length; f++){
            System.out.println(dias[f]);
        }

    }
}
