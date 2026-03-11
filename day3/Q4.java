
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>=B && A>=C){
            System.out.println(A + "is largest than "+ B +"and"+ C);
        }else if(B>=C){
            System.out.println(B + "is largest than "+ A +"and"+ C);
        }else{
            System.out.println(B + " is largest than "+ A +" and "+ C);
        }
    }
    
}
