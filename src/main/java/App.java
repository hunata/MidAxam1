import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int month = sc.nextInt();
        if (isValidMonth(month)) {
            System.out.println("Đây là 1 tháng trong năm");
            printMonth(month);
        } else System.out.println("Đây không phải là 1 tháng trong năm");
    }

    public static boolean isValidMonth(int m) {
        if (m > 0 && m <= 12) {
            return true;
        }
        return false;
    }

    public static void printMonth(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng này có 29 ngày nếu là năm nhuần");
                System.out.println("Tháng này có 28 ngày nếu không là năm nhuần");

            default:
                System.out.println("ko có ngày tháng nay");
                break;
        }
    }
}
