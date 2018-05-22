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
    public void classStartsWith9Names(){
                assertEquals(9, classNames.amountOfNames());
            }

            @Test
    public void canGetSingleNameBack(){
                assertEquals("John Paul Jones", classNames.single());
            }

            @Test
    public void canGetPairs(){
                assertEquals(2, classNames.pairs().size());
            }

        }
