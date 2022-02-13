package ru.netology.SQRService;

public class SQRService {
    public int quantityofsqr(int first, int last) {
        int count = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= first && i * i <= last) {
                count++;
            }
        return count;
    }
}
