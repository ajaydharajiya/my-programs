import java.util.Scanner;

public class Table_of_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plse enter number to print table :");
        int tabl = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(tabl + "*" + i + "=" + i * tabl);
        }

    }
}
