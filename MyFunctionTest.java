import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyFunctionTest {

	@Test
	public void testMaxAndMin() {

	int[] array = {7, 3, 2, 2, 6};

	int[] expected = {5};

	int[] returned = FunctionMaxAndMin.MaxiAndMiniClassWork(array);

	assertArrayEquals(expected, returned);

}
}