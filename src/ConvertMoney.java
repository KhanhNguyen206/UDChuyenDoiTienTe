import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        System.out.println("Chọn số tương ứng để quy đổi");
        System.out.println("1. Đổi tiền USD sang VND");
        System.out.println("2. Đổi tiền VND sang USD");

        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        System.out.println("Nhập vào đây số tiền bạn muốn đổi");
        int money=scanner.nextInt();


        switch (choice){
            case 1:
                System.out.println(money*23000);
                break;
            case 2:
                System.out.println(money/23000);
                break;
            default:
                System.out.println("No choice");
                break;
        }
    }
}
