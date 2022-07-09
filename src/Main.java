import java.time.LocalDate;
import model.Person;
import util.GenericList;
import util.SearchResult;

public class Main {

  public static void main(String[] args) {

    GenericList<Person> persons = new GenericList<>();
    persons.add(Person.build("abc", LocalDate.now()));
    persons.add(Person.build("anchor", LocalDate.of(1999, 10, 15)));

    GenericList<String> pets = new GenericList<>();
    pets.add("dog");
    pets.add("cat");

    GenericList<Integer> age = new GenericList<>();

    age.add(12);
    age.add(50);

    String pet = pets.get(1);
    Person person = persons.get(0);
    int numberOfAge = age.get(1);

    SearchResult<Person> searchResult = new SearchResult<>(person, 10);
    Person result = searchResult.getResult();
    int total = searchResult.getTotal();
  }
}
