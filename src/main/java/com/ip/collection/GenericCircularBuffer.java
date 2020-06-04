package com.ip.collection;

public class GenericCircularBuffer<T> {
  private final T[] buffer;
  private int readCursor = 0;
  private int writeCursor = 0;

  @SuppressWarnings("unchecked")
 public GenericCircularBuffer(int size) {
    buffer = (T[]) new Object[size];
  }

 /**
  * this is the boolean class.
 * @param value value
 * @return true
 */
  public boolean offer(T value) {
    if (buffer[writeCursor] != null) {
      return false;
    }

    buffer[writeCursor] = value;
    writeCursor = next(writeCursor);
    return true;
  }

  @SuppressWarnings("unchecked")
  public T poll() {
    T value = buffer[readCursor];
    if (value != null) {
      buffer[readCursor] = null;
      readCursor = next(readCursor);
    }
    return value;
  }

  private int next(int index) {
    return (index + 1) % buffer.length;
  }
}


