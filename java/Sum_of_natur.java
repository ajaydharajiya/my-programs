import java.util.Scanner;

public class Sum_of_natur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plses enter number to sum nature number :");
        int nature = sc.nextInt();
        int ans = 0;
        for (int i = 0; i<= nature; i++){
            ans = i + ans;
        }
        System.out.println("sum of nature = " + ans);
    }
}
