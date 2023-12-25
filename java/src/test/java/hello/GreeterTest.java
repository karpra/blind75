package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
	@DisplayName("sayHello")
	void addsTwoNumbers() {
		Greeter greeter = new Greeter();
		assertEquals("Hello world!", greeter.sayHello(), "Hello World! should equal sayHello");
	}

}
