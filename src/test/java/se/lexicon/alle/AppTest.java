package se.lexicon.alle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

        //Arrange
        public void Test_isAdult(){
        int age = 11;
        boolean expected = true;


        //Act

        boolean actual = App.isAdult(age);

        //Assert

        assertEquals(expected, actual);
        assertTrue(actual);
        assertNotNull(actual);


    }
}
