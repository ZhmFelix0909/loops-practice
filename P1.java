import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num=input.nextInt(), n=4;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
