import java.util.Scanner;
public class odd {
    public static void odd_series(int n) {
        for(int i = 0; i < 2*n + 1; i++){
            if(i % 2!= 0)
            System.out.println(i);
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        odd_series(size);
        }
    }
