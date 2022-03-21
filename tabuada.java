import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
       /* int idades[] = new int[11];
        
        for(int i = 0; i < idades.length; i++){
            idades[i] = i*2;
        }
        //for(int i = 0; i < idades.length; i++){ //esse metodo tbm fuinciona
            //System.out.println(idades[i]); // esse metodo tamvem funciona
            for(int i:idades){
                System.out.println(i);
            }
        //} //fechando o metodo

    }*/

    int entrada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = sc.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
        sc.close();
    }
}