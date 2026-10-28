import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
    int num=input.nextInt(), n=0;
        while(num!=-1) {
            if (num >0) {
                n++;
            }
            System.out.print("Please enter a number: ");
            num = input.nextInt();

        }
        System.out.println("The total is "+ n);
}
}

