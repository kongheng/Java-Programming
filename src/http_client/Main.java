package http_client;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Paths;
import java.time.Duration;
import supplier.ResourceURL;

public class Main {

  public static void main(String[] args) {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(ResourceURL.todos.get().concat(String.valueOf(1))))
        .timeout(Duration.of(10, SECONDS))
        .build();
    client.sendAsync(request, BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenAccept(System.out::println)
        .join();
    HttpRequest postRequestStringBody = HttpRequest.newBuilder()
        .uri(URI.create(ResourceURL.posts.get()))
        .headers("Content-Type", "text/plain;charset=UTF-8")
        .POST(BodyPublishers.ofString("hello world"))
        .build();

    byte[] sampleData = "Sample request body".getBytes();
    HttpRequest postRequestByteArrayBody = HttpRequest.newBuilder()
        .uri(URI.create(ResourceURL.posts.get()))
        .headers("Content-Type", "text/plain;charset=UTF-8")
        .POST(BodyPublishers.ofByteArray(sampleData))
        .build();

    HttpRequest postRequestInputStreamBody = HttpRequest.newBuilder()
        .uri(URI.create("https://jsonplaceholder.typicode.com/posts/post"))
        .headers("Content-Type", "text/plain;charset=UTF-8")
        .POST(HttpRequest.BodyPublishers.ofInputStream(() -> new ByteArrayInputStream(sampleData)))
        .build();

    String filePath = "src/test/resources/sample.txt";
    try {
      HttpRequest postRequestFileBody = HttpRequest.newBuilder()
          .uri(URI.create(ResourceURL.posts.get()))
          .header("Content-Type", "text/plain;charset=UTF-8")
          .POST(BodyPublishers.ofFile(Paths.get(filePath)))
          .build();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
