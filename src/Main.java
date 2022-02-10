import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch ka = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban bat dau");
        ka.start();
        System.out.println("Ban co muon ket thuc khong");
        int a = scanner.nextInt();
        if (a == 1) {
            ka.stop();
            System.out.println(ka.getElapseTime());
        }
    }
}
