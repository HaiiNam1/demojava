import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.print("Nhap so luong phan tu trong danh sach: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int element = scanner.nextInt(); 
            numbers.add(element);
        }

        System.out.println("Danh sach da nhap: " + numbers);

        if (!numbers.isEmpty()) {
            int largest = Collections.max(numbers); 
            System.out.println("Phan tu lon nhat trong danh sach la: " + largest);
        } else {
            System.out.println("Danh sach trong.");
        }

        scanner.close();
    }
}
