import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Test cau a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5 + 10 = " + mfx500.cong(5, 10));
        System.out.println("4 * 5 = " + mvn500.nhan(4, 5));
        System.out.println("4 / 0 = " + mvn500.chia(4, 5));

        System.out.println("Test cau b: ");
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        double arr1[] = new double[n];
        double arr2[] = new double[n];

        System.out.print("Nhap arr1: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextDouble();
        }
        System.out.print("Nhap arr2: ");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextDouble();
        }

        sxchen.sapXepTang(arr1);
        System.out.println("Arr1 sap xep chen tang dan");
        System.out.print("Arr1: ");
        for (int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sxchen.sepXepGiam(arr1);
        System.out.println("Arr1 sap xep chen giam dan");
        System.out.print("Arr1: ");
        for (int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sxchon.sapXepTang(arr2);
        System.out.println("Arr2 sap xep chon tang dan");
        System.out.print("Arr2: ");
        for (int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        sxchon.sepXepGiam(arr2);
        System.out.println("Arr2 sap xep chon giam dan");
        System.out.print("Arr2: ");
        for (int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        } 
        System.out.println();
    }
}
