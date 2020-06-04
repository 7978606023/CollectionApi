package com.ip.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExa {

/**
 * this is simple list interface.
 * @return ar
 */
  
  public List<String> myArray() {
    List<String> ar = new ArrayList<>();
    ar.add("Customer1");
    ar.add("Customer2");
    ar.add("Customer3");
    return ar;
  }
}