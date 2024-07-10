package chapter19;

public class MaxUsingGenericType {
    public static void main(String[] args) {
        Integer num1 = 42;
        Integer num2 = 24;
        Double double1 = 3.14;
        Double double2 = 2.71;
        String str1 = "apple";
        String str2 = "banana";

        System.out.println("Max of " + num1 + " and " + num2 + ": " + max(num1, num2));
        System.out.println("Max of " + double1 + " and " + double2 + ": " + max(double1, double2));
        System.out.println("Max of " + str1 + " and " + str2 + ": " + max(str1, str2));
    }

    /** Trả về giá trị lớn nhất giữa hai đối tượng */
    public static <E extends Comparable<E>> E max(E o1, E o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}

