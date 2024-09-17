import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    App app = new App();
    @Test
    public void greetingsTest(){
        assertEquals("Hello, friend!", app.greeting());

    }
}
