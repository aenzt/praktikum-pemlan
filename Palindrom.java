import java.util.Scanner;

public class Palindrom {
    public static void checkSelde(int num){
        int r, sum = 0, temp;
        int n = num;

        temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println(temp + " adalah selde.");
        }else{
            System.out.println(temp + " bukan selde.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        checkSelde(n);
    }
}
