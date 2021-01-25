import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MainTest {

    Main mainMy;

    @BeforeEach
    public void init() {
        mainMy = new Main();
    }

    @Test
    @NullAndEmptySource
    void testAckAfterForArr() {
        Integer[] insertArr = new Integer[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        Integer[] outArr = new Integer[]{1, 7};
        Assertions.assertArrayEquals(outArr,mainMy.ackAfterForArr(insertArr));

    }

    @Test
    void testAckAfterForArrException() {
        Integer[] insertArr = new Integer[]{1, 2, 2, 3, 1, 7};
        Assertions.assertThrows(RuntimeException.class, () -> {
            mainMy.ackAfterForArr(insertArr);
        });

    }

    @Test
    void testCheckOneAndFourInArr() {
        Integer[] insertArr = new Integer[]{1, 2, 2, 3, 1, 7};
        Assertions.assertFalse(mainMy.checkOneAndFourInArr(insertArr));
        Assertions.assertTrue(mainMy.checkOneAndFourInArr(new Integer[]{1, 2, 2, 3, 1, 7,4,4}));
    }



}
