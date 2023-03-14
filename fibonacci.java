import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe um n�mero: ");
        int num = scanner.nextInt();
        
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0); 
        fibo.add(1);  
        
        while (fibo.get(fibo.size() - 1) < num) {
           
            fibo.add(fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2));
        }
        
        if (fibo.contains(num)) {
            System.out.printf("O numero %d pertence � sequ�ncia de Fibonacci.", num);
        } else {
            System.out.printf("O numero %d n�o pertence � sequ�ncia de Fibonacci.", num);
        }
        
        scanner.close();
    }
}