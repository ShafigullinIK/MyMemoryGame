import org.junit.Assert;
import org.junit.Test;


public class TestMain {

    @Test
    public void testSquare(){
        Assert.assertEquals(4, Main.square(2));
        Assert.assertEquals(4, Main.square(-2));
        Assert.assertEquals(0, Main.square(0));
    }
}
