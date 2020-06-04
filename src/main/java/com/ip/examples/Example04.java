package com.ip.examples;

import java.util.stream.IntStream;

public class Example04 {

    /**
     * @param args args
     */
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum += i;
    }

    int easySum = IntStream.range(0, 100)
                .sum();

    System.out.println("Sum with for-loop:" + sum);
    System.out.println("Sum with int stream:" + easySum);
  }
}