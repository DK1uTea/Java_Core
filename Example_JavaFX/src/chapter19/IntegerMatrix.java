package chapter19;

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override
    /** Cộng hai số nguyên */
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }

    @Override
    /** Nhân hai số nguyên */
    protected Integer multiply(Integer o1, Integer o2) {
        return o1 * o2;
    }

    @Override
    /** Xác định giá trị zero cho số nguyên */
    protected Integer zero() {
        return 0;
    }
}
