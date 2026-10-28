import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num=input.nextInt(), n=1;
        while(num>=1){
            System.out.println(num);
            num--;
        }
    }
}