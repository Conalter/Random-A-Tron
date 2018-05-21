import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomATronTest {

    RandomATron classNames;

            @Before
    public void before(){
                classNames = new RandomATron();
            }

            @Test
    public void classStartsWith19Names(){
                assertEquals(19, classNames.amountOfNames());
            }

            @Test
    public void canGetSingleNameBack(){
                assertEquals("Paul", classNames.single());
            }

            @Test
    public void canGetPiars(){
                assertEquals(2, classNames.pairs().size());
            }

        }
}
