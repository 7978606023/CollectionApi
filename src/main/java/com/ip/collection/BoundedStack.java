package com.ip.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class BoundedStack<E> {

  private E[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public BoundedStack() {
    elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(E e) {
    ensureCapacity();
    elements[size++] = e;
  }

  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * this the pop class.
 * @return result
 */

  public E pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    E result = elements[--size];
    elements[size] = null;
    return result;
  }

   
 /**
 * going through the collection.
 * @param src src
 */
  public void pushAll(Iterable<? extends E> src) {
    for (E e : src) {
      push(e);
    }
  }

 /**
 * Adding to dst so consumer.
 * @param dst dst
 */
  public void popAll(Collection<? super E> dst) {
    while (!isEmpty()) {
      dst.add(pop());
    }
  }
}
