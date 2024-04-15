
// B211202025
//  Mert Çelik
//  Software Verification and Validation - Homework1
//   https://github.com/mertcelikdev/jUnitTest_Homework

package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("org.example.CalculatorTest#parameters_of_dividing_process")
    public void divide(float a, float b, float expected) {
        Calculator calculator = new Calculator();
        float result = calculator.divide(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> parameters_of_dividing_process() {
        return Stream.of(
                new Object[]{10, 5, 2},
                new Object[]{10, 4, 2.5f},
                new Object[]{12.5f, 2.5f, 5},
                new Object[]{10, 4, 2.5f},
                new Object[]{12.5f, 5, 2.5f}

        );
    }



}
