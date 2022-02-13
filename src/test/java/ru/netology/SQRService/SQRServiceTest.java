package ru.netology.SQRService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Range1',150,200,2",
            "'Range0',0,0,0",
            "'Range3',169,196,2",
            "'Range4',166,198,2",
            "'Range5',100,9801,90"})
    void shouldCalculateForINRange(String testName, int first, int last, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long actual = service.quantityofsqr(first, last);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Range6',10,200,2",
            "'Range7',170,195,2",
            "'Range8',101,9800,90"})
    void shouldCalculateNOTForINRange(String testName, int first, int last, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long actual = service.quantityofsqr(first, last);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertNotEquals(expected, actual);
    }
}


