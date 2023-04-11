package Except;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.tasks.OddException;
import org.tasks.Multipl;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void TestExc(){
       Multipl m = new Multipl();
       String canon = "Множитель нечётный";
       try{
           int multiply = m.mult(5, 2);
       } catch (OddException thrown){
           assertEquals(canon, thrown.getMessage());
       }
    };

}