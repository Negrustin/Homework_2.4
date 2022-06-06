package ru.netology.sqr;

public class SQRService {

    int count;
    int i;

    int CountSqrInRange(int lowerLimitRange, int upperLimitRange) {
        for (i = 10; i <= 99; i++) {
            if (i * i >= lowerLimitRange && i * i <= upperLimitRange) count++;
        }
        return count;
    }
}
