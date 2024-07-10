package chapter19;

public class GenericSort {
    public static void main(String[] args) {
        // Tạo mảng Integer
        Integer[] intArray = {2, 4, 3};

        // Tạo mảng Double
        Double[] doubleArray = {3.4, 1.3, -22.1};

        // Tạo mảng Character
        Character[] charArray = {'a', 'J', 'r'};

        // Tạo mảng String
        String[] stringArray = {"Tom", "Susan", "Kim"};

        // Sắp xếp các mảng
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Hiển thị các mảng đã sắp xếp
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }

    /** Sắp xếp mảng các đối tượng có khả năng so sánh */
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Tìm phần tử nhỏ nhất trong list[i+1..list.length-1]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Hoán đổi list[i] với list[currentMinIndex] nếu cần;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /** In ra mảng các đối tượng */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
