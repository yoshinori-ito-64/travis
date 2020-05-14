package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class GreeterTest {
    @Test
    public void test() {
        Greeter greeter = new Greeter();
        assertThat(greeter.sayHello(), is("Hello Gradle world on Circle CI!"));
    }
}
