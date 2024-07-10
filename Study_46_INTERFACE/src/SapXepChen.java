public class SapXepChen implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        // TODO Auto-generated method stub
        double n = arr.length;
        for (int i = 1; i < n; i++) {
            double x = arr[i];
            int pos = i - 1;
            while (pos >= 0 && x < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = x;
        }
    }

    @Override
    public void sepXepGiam(double[] arr) {
        // TODO Auto-generated method stub
        double n = arr.length;
        for (int i = 1; i < n; i++) {
            double x = arr[i];
            int pos = i - 1;
            while (pos >= 0 && x > arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = x;
        }
    }
    
}
