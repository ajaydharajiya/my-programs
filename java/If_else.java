import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plase select button : ");
        int button = sc.nextInt();
        if (button == 1){
            System.out.println("english");
        }
        else if(button == 2) {
            System.out.println("gujarati");
        }
        else{
            System.out.println("invalid options ");
        }
    }
}
