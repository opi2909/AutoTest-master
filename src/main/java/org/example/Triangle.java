package org.example;

public class Triangle {
    public static void main(String[] args) {
        Aria(3, 4, 5);

    }

    public static double Aria(int a, int b, int c) throws MyException {
        if (a<=0 || b<=0 || c <=0) throw new MyException ("Текст моей ошибки");
        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(S);
        return S;
    }
}