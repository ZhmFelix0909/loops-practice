import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num=input.nextInt(), n=2;
        while(n<=num){
            System.out.println(n);
            n=n+2;
        }
    }
}
