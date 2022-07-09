package util;

import lombok.Getter;

@Getter
public class SearchResult<T> {

  private final T result;
  private final int total;

  public SearchResult(T result, int total) {
    this.result = result;
    this.total = total;
  }
}
