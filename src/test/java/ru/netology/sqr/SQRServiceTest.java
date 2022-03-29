package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"several in diapason, 200, 300, 3",
            "zero in diapason, 0, 99, 0",
            "one in diapason, 0, 100, 1",
            "all in diapason, 0, 100000000, 90"}
    )
    void shouldCalculate(String testName, int min, int max, int expected) {

        SQRService service = new SQRService();

        //целевой метод
        int actual = service.calculate(min, max);

        assertEquals(expected, actual);

    }

}