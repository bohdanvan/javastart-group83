package com.bvan.javastart.lessons3_4.types.double_type;

import java.math.BigDecimal;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 2827943700L;
        double moneyForOutput = (double)money / 100_000_000;
        System.out.println(moneyForOutput);

        BigDecimal a = new BigDecimal("123456765432345665434567.8");
        BigDecimal b = new BigDecimal("7898765456787656789876567.9");
        BigDecimal c = a.multiply(b);
        System.out.println(c);
    }
}
