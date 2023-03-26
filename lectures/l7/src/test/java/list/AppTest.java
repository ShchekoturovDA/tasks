package list;

//import main.java.sorts.sorts*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.tasks.LinkedList;

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



}