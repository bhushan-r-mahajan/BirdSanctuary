import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdSanctuaryManagerTest {
    @Test
    void givenAddBird_WhenProper_ReturnsTrue() {
        BirdSanctuaryManager bird = new BirdSanctuaryManager();
        int result = bird.getAllCount();
        Assertions.assertEquals(10,result);
    }

    //@Test
    //void name() {
        //BirdSanctuaryManager bird = new BirdSanctuaryManager();
       // String result = bird.addBird("parrot");
    //}
}
