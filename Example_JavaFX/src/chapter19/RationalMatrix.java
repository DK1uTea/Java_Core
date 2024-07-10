package chapter19;

public class RationalMatrix extends GenericMatrix<Rational> {
    @Override
    /** Cộng hai số hữu tỷ */
    protected Rational add(Rational r1, Rational r2) {
        return r1.add(r2);
    }

    @Override
    /** Nhân hai số hữu tỷ */
    protected Rational multiply(Rational r1, Rational r2) {
        return r1.multiply(r2);
    }

    @Override
    /** Xác định giá trị zero cho số hữu tỷ */
    protected Rational zero() {
        return new Rational(0, 1);
    }
}

