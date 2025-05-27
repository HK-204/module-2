package com.example;

public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a ||
                a == 0 || b == 0 || c == 0 ||
                a < 0 || b < 0 || c < 0) {
            return "Khong phai tam giac";
        } else if (a == b && b == c) {
            return "Tam giac deu";
        } else if (a == b || a == c || b == c) {
            return "Tam giac can";
        } else {
            return "Tam giac thuong";
        }
    }
}
