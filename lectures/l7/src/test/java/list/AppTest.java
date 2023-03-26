package list;

//import main.java.sorts.sorts*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.tasks.LinkedList;
import org.tasks.ListGen;
import org.tasks.pair;

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
    public void TestOneList() {
        LinkedList ll =new LinkedList();
        ll.add(6);
        boolean t = true;
        if (ll.size() != 1){
            t = false;
        }
        assertTrue( t );
    };

    @Test
    public void TestTwoList() {
        LinkedList ll =new LinkedList();
        ll.add(6);
        ll.add(5);
        Object o = 5;
        boolean t = true;
        if (ll.get(2) != o) {
            t = false;
        }
        assertTrue( t );
    };


    @Test
    public void TestThreeList() {
        LinkedList ll = new LinkedList();
        Object k = 0.5;
        int n = 20;
        for (int i = 1; i <= n; i++){
            ll.add(k);
        }
        boolean t = true;
        if (ll.size() != n) {
            t = false;
        }
        assertTrue( t );
    };

    @Test
    public void TestOneListGen() {
        ListGen llg =new ListGen();
        pair<String, Double> w = new pair<>("Andy", 67.32);
        llg.add(w);
        boolean t = true;
        if (llg.size() != 1){
            t = false;
        }
        assertTrue( t );
    };

    @Test
    public void TestTwoListGen() {
        ListGen llg =new ListGen();
        pair<String, Double> w = new pair<>("Andy", 67.32);
        llg.add(w);
        w = new pair<>("Ned", 45.82);
        llg.add(w);
        boolean t = true;
        if (llg.get(2) != w){
            t = false;
        }
        assertTrue( t );
    };


    @Test
    public void TestThreeListGen() {
        ListGen llg =new ListGen();
        pair<String, Double> w = new pair<>("Andy", 67.32);
        w = new pair<>("Ned", 45.82);
        int n = 20;
        for (int i = 1; i <= n; i++){
            llg.add(w);
        }
        boolean t = true;
        if (llg.size() != n) {
            t = false;
        }
        assertTrue( t );
    };


}