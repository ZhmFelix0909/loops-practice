import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int b=input.nextInt(), n=1, p=0;
        while(b<=20) {
                n++;
            System.out.print("Please enter a number: ");
            p = input.nextInt();
            b+=p;
        }
        System.out.println("saving: "+ b);
        System.out.println("deposits: "+ n);
    }
}

