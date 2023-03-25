package sorts;

//import main.java.sorts.sorts*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
 /*   @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
*/
    @Test
    public void TestOneBubble() {
        double[] arr = {100, 45.7, -67.3, 0, -3, 34, 76.342, 76.341, 100};
        sorts.Bubble(arr);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                    t = false;
            };
        };
        assertTrue( t );
    };

    @Test
    public void TestTwoBubble() {
        double[] arr = {1, 2, 3, 4, 8, 0};
        sorts.Bubble(arr);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };
    @Test
    public void TestThreeBubble() {
        double[] arr = {1, 45, 67, 89, 100};
        sorts.Bubble(arr);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };

    @Test
    public void TestFourBubble() {
        double[] arr = new double[1000];
        double beg = 1000;
        for(int j = 0; j < arr.length; j ++){
            arr[j] = beg;
            beg -= 10.873;
        };
        sorts.Bubble(arr);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };

    @Test
    public void TestOneQuick() {
        double[] arr = {100, 45.7, -67.3, 0, -3, 34, 76.342, 76.341, 100};
        sorts.QuickSort(arr, 0, arr.length - 1);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };

    @Test
    public void TestTwoQuick() {
        double[] arr = {1, 2, 3, 4, 8, 0};
        sorts.QuickSort(arr, 0, arr.length - 1);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };
    @Test
    public void TestThreeQuick() {
        double[] arr = {1, 45, 67, 89, 100};
        sorts.QuickSort(arr, 0, arr.length - 1);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };

    @Test
    public void TestFourQuick() {
        double[] arr = new double[1000];
        double beg = 1000;
        for(int j = 0; j < arr.length; j ++){
            arr[j] = beg;
            beg -= 10.873;
        };
        sorts.QuickSort(arr, 0, arr.length - 1);
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                t = false;
            };
        };
        assertTrue( t );
    };


}
