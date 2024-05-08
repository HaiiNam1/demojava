import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class chuong4sline21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int phanTu = scanner.nextInt();
            danhSach.add(phanTu);
        }

        System.out.println("Danh sach vua nhap: " + danhSach);

        if (!danhSach.isEmpty()) {
            int lonNhat = Collections.max(danhSach);
            System.out.println("Phan tu lon nhat la: " + lonNhat);
        } else {
            System.out.println("Danh sach trong.");
        }

        scanner.close();
    }
}
