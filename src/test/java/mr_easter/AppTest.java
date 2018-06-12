package mr_easter;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

/**
 * Unit test laget i forbindelse med test for KnowIt AS.
 * Author: Anders Sørenmo Påsche
 * Date: 12.06.18
 */
public class AppTest 
{
    @BeforeClass
    //Setter opp testmiljøet
    public static void SetUp(){
        //TODO
    }

    @After
    //Resetter miljøet etter hver test.
    public static void Reset(){
        //TODO
    }

    @AfterClass
    //Rydder opp etter at alle tester er utført.
    public static void CleanUp(){
        //TODO
    }

/**
 * Tester starter her.
 */

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
