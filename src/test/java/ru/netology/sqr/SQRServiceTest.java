package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrtAreaTestValues.csv", numLinesToSkip = 1)
    void sqrtArea(int expected, int lowerLimitRange, int upperLimitRange) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.CountSqrInRange(lowerLimitRange, upperLimitRange);

        Assertions.assertEquals(expected, actual);
    }


}
