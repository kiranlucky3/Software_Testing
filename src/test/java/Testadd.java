
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {

    private static Unit uc;

    @BeforeClass
    public static void setup() {
        uc =new Unit();
    }

    @Test
    public void test_add(){
        assertEquals(4, uc.add(2,2));
    }

}