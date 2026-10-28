import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num=input.nextInt(), n=0;
        while(num!=0){
            n=n+num;
            System.out.print("Please enter a number: ");
            num=input.nextInt();
        }
        System.out.println("The total is "+ n);
    }
}
