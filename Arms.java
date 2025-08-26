public class Arms {
    public static void main(String[] args) {
        for(int j = 1;j <= 10000; j++) {
        int num = j;
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
            for(int i = 1;i <= count; i++) {
                power *= digit;
            }
            sum += power;
            temp1 /= 10;
        }
        if(sum  == num) {
            System.out.println(num);
        }
        }
    }
}  
