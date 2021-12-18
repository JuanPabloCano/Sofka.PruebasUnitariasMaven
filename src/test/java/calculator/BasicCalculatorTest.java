package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void sum(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + "+ second+ " should equal " + expectedResult);
    }

    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "5,    2,   3",
            "51, 49, 2",
            "34,  11, 23"
    })
    void subtraction(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtraction(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3,    3,   9",
            "4,    5,   20",
            "10,  5, 50",
            "45,  2, 90"
    })
    void multiplication(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplication(first, second),
                () -> first + " * "+ second+ " should equal " + expectedResult);
    }


    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "56,    4,   14",
            "28,    7,   4",
            "588,  6, 98",
            "125,  5, 25"
    })
    void division(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / "+ second+ " should equal " + expectedResult);
    }
}