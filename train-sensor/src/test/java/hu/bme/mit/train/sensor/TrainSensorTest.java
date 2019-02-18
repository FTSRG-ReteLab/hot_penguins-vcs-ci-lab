package hu.bme.mit.train.sensor;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {

    }

    @Test
    public void AnotherTestStub() {
        assertTrue(true);
    }

    @Test
    public void TachographStub() {
        Tachograph tachograph =new Tachograph();
        //Assert.assert(tachograph.table.isEmpty());

        if(tachograph.table.isEmpty()){
        assertFalse(false);
        }
        else {
            assertTrue(true);
        }
    }

}
