import java.util.Scanner;
public class Matriz01{
    public static void main(String[] args){

        int [] idade;
        idade = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < idade.length; i++){
             System.out.println("Digite o " + (i ) + " numero: ");
             idade[i]=sc.nextInt();
            
            System.out.println("Eu tenho "+ idade[4] + " anos." );
            
            
        }  

        sc.close();
    }
}