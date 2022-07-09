package util;

import java.util.ArrayList;

public class GenericList<T> {

  private final ArrayList<T> items;

  public GenericList() {
    this.items = new ArrayList<>();
  }

  public void add(T item) {
    items.add(item);
  }

  public T get(int index) {
    return items.get(index);
  }
}
