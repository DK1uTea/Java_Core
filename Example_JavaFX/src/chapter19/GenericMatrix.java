package chapter19;

public abstract class GenericMatrix<E extends Number> {
    /** Phương thức trừu tượng cho việc cộng hai phần tử của ma trận */
    protected abstract E add(E o1, E o2);

    /** Phương thức trừu tượng cho việc nhân hai phần tử của ma trận */
    protected abstract E multiply(E o1, E o2);

    /** Phương thức trừu tượng để xác định giá trị zero cho phần tử ma trận */
    protected abstract E zero();

    /** Cộng hai ma trận */
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
        // Kiểm tra kích thước của hai ma trận
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException("Hai ma trận không có cùng kích thước");
        }

        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];

        // Thực hiện phép cộng
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        }

        return result;
    }

    /** Nhân hai ma trận */
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
        // Kiểm tra kích thước
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException("Hai ma trận không có kích thước phù hợp");
        }

        E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];

        // Thực hiện phép nhân hai ma trận
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();

                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
                }
            }
        }

        return result;
    }

    /** In ra các ma trận, toán tử và kết quả phép tính */
    public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(" " + m1[i][j]);
                if (i == m1.length / 2) {
                    System.out.print(" " + op + " ");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < m2.length; j++) {
                System.out.print(" " + m2[i][j]);
                if (i == m1.length / 2) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < m3.length; j++) {
                System.out.print(m3[i][j] + " ");
            }

            System.out.println();
        }
    }
}

