import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArrayHandlerTest {
    @Test
    public void testIndex() {
        ArrayHandler handler = new ArrayHandler();
        int[] array = {10, 20, 30};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            handler.getElementAndIndex(array, 5);
        });
    }
}