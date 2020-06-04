package com.ip.examples;

import java.util.stream.Stream;


public class Example03 {

  /**
 * @param args args
 */
  public static void main(String[] args) {
    int number = Stream.iterate(1, n -> n * 2)
                        .filter(n -> n % 1024 == 0)
                        .findFirst().get();
  }
}
