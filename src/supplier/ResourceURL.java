package supplier;

import java.util.function.Supplier;

public class ResourceURL {
  public static Supplier<String> posts = () -> "https://jsonplaceholder.typicode.com/posts/";
  public static Supplier<String> todos = () -> "https://jsonplaceholder.typicode.com/todos/";
}
