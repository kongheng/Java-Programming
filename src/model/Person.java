package model;

import java.time.LocalDate;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
  private String uuid;
  private String personName;
  private LocalDate dob;

  public static Person build(String personName, LocalDate dob) {
    return Person.builder()
      .uuid(UUID.randomUUID().toString())
      .personName(personName)
      .dob(dob)
      .build();
  }
}
