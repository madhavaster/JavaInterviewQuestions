package enhancedswitch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class UtilsTest {

    @ParameterizedTest
    @MethodSource("input")
    void getDaysV2(Month month, long year, int noOfDays) {
        Assertions.assertEquals(noOfDays, Utils.getDaysV2(month, year));
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(Month.JAN, 2024, 31),
                Arguments.of(Month.FEB, 2024, 29),
                Arguments.of(Month.NOV, 2024, 0)
        );
    }
}