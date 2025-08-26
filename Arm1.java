import java.util.Scanner;
class Arm1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        int temp1 = num;
        
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        
        int sum = 0;
        while(temp1 > 0) {
            int digit = temp1 % 10;
            int power = 1;
            for(int i = 1; i <= count; i++) {
                power *= digit;
            }
            
            sum += power;
            temp1 /= 10;
        }
        if (sum == num) {
            System.out.println("armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}