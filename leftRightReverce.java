import java.util.Scanner;

public class leftRightReverce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int mid = num / 2;

       
        for (int i = 1; i <= num; i++) {
            if (i <= mid) {
                System.out.print((mid - i + 1) + " "); 
            } else {
                System.out.print((num - (i - mid - 1)) + " "); 
            }
        }

        scanner.close();
    }
}
