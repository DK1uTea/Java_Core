package chapter18;

public class RecursiveSelectionSort {
    public static void sort(double[] list) {
        // Gọi phương thức sort với danh sách đầy đủ (từ 0 đến chiều dài danh sách - 1)
        sort(list, 0, list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            // Tìm số nhỏ nhất và chỉ mục của nó trong list[low .. high]
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // Hoán đổi số nhỏ nhất trong list[low .. high] với list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sắp xếp phần còn lại trong list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        double[] arr = {5.2, 1.8, 4.5, 2.3, 0.9};

        // Gọi phương thức sort để sắp xếp mảng arr
        sort(arr);

        // In ra mảng đã sắp xếp
        for (double element : arr) {
            System.out.print(element + " ");
        }
    }
}


