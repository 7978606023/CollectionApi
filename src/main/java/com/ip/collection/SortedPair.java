package com.ip.collection;

public class SortedPair<T extends Comparable<T>> {
  private final T first;
  private final T second;

  /**
 * @param left left
 * @param right right
 */
  public SortedPair(final T left, final T right) {
    if (left.compareTo(right) < 0) {
      this.first = left;
      this.second = right;
    } else {
      first = right;
      second = left;
    }
  }

  public T getSecond() {
    return second;
  }

  public T getFirst() {
    return first;
  }

  @Override
  public String toString() {
      
    return "SortedPair{" 
      + "first=" + first
      + ", second=" + second 
      + '}';
  }
}
