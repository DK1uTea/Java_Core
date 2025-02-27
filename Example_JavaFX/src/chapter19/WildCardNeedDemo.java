package chapter19;

public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 is autoboxed into new Integer(1)
        intStack.push(2);
        intStack.push(-2);

        System.out.print("The max number is " + max(intStack));
    }

    /** Tìm giá trị lớn nhất trong một ngăn xếp các số */
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // Khởi tạo giá trị max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }

        return max;
    }
}

