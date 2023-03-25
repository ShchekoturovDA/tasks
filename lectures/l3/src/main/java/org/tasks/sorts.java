package sorts;


public class sorts {
    public static double[] Bubble(double[] arr) {
        double l;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j] < arr[j - 1]) {
                    l = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = l;
                }
            }
        }
        return arr;
    }

    public static double[] QuickSort( double[] arr, int l, int r){
        double b = arr[(r + l) / 2];
        int i = l;
        int j = r;
        double m;
        do{
            while (arr[i] < b){
                i++;
            };
            while (arr[j] > b){
                j--;
            };
            if (i <= j) {
                m = arr[i];
                arr[i] = arr[j];
                arr[j] = m;
                i++;
                j--;
            }
            if (l < j) {
                QuickSort( arr, l, j);
            }
            if (i < r) {
                QuickSort( arr, i, r);
            }
        } while (i < j);
        return arr;
    }

}