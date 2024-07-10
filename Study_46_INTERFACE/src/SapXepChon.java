public class SapXepChon implements SapXepInterface{

    @Override
    public void sapXepTang(double[] arr) {
        // TODO Auto-generated method stub
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }


    @Override
    public void sepXepGiam(double[] arr) {
        // TODO Auto-generated method stub
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    
}
