import java.util.Scanner;

public class Assets {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử: ");
            size = sc.nextInt();
            if ( size > 20 ) {
                System.out.println("Số phần tử tối đa là 20");
            }
        } while (size > 20);
        arr = new int[size];
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = sc.nextInt();
        }
        for ( int x : arr) {
            System.out.print(x + "\t");
        }
        int max = arr[0];
        int index = 0;
        for ( int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("Số lớn nhất là: " + max + " ở vị trí thứ " + index);
    }
}
