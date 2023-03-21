import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum1 = reverse(num);
        System.out.println("Reversed number: " + reversedNum1);
        int reversedNum2 = reverseV2(num);
        System.out.println("Reversed number from String Builder: " + reversedNum2);
    }

    private static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int lastDigit =  num % 10;
            reversedNum = reversedNum*10 + lastDigit;
            num = num/10;
        }
        return reversedNum;
    }

    private static int reverseV2(int num) {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
        String reversedStr = stringBuffer.reverse().toString();
        return Integer.parseInt(reversedStr);
    }

}
