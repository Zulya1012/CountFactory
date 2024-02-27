import java.util.Scanner;
public class count{
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter integer number:");
        int num = s.nextInt();

        int count = countFactors(num);

        System.out.println(count);
    }

    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
