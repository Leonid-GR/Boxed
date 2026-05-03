import org.example.Box;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {

    @Test
    void testEmptyBox() {
        Box<Integer> box = new Box<>();
        assertTrue(box.isEmpty());
    }

    @Test
    void testPutAndGet() {
        Box<String> box = new Box<>();
        box.put("Hello");
        assertEquals("Hello", box.get());
    }

    @Test
    void testIsEmptyAfterPut() {
        Box<String> box = new Box<>();
        box.put("Data");
        assertFalse(box.isEmpty());
    }

    @Test
    void testClear() {
        Box<String> box = new Box<>();
        box.put("Test");
        box.clear();
        assertTrue(box.isEmpty());
        assertNull(box.get());
    }
}
