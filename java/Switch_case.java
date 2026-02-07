import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plese select option : ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("english");
                break;
            case 2:
                System.out.println("hindi");
                break;
            default:
                System.out.println("plsese choice valid option ");
                break;
        }

    }
}
