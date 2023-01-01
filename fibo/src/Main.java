import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.print("Fibonacci Serisi: ");
         int number = input.nextInt();
         int f1 = 0,f2 = 0;
         if (number <= 0){
             System.out.print("Hatalı giriş yaptınız.");
         }else{
             for (int i = 0; i <= number ; i++){
                 if(i == 0){
                      f1 = 0;
                      f2= 1;
                     System.out.print(f1 + " ");
                 }else{
                     int j = f2;
                     f2 += f1;
                     f1 = j ;
                     System.out.print(f1 + " ");
                 }
             }
         }
    }
}