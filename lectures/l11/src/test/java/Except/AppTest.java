package Except;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.tasks.ErrMult;
import org.tasks.Multipl;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void TestExc(){
       Multipl m = new Multipl();
       String canon = "Множитель нечётный";
       try{
           m.Mult(5, 2);
       } catch (ErrMult thrown){
           assertEquals(canon, thrown.getMessage());
       }
    };


}