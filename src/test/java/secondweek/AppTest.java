package secondweek;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void initPropertiesTest() {
        Assigment2 assigment2 = new Assigment2();
        assertThrows(MyOwnException.class, () -> assigment2.initProperties("sdsdsdsa"));
    }
}
