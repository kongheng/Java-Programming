package solid.interface_segregation;

public class Asean implements Human {

  @Override
  public void eat() {
    System.out.println("eat");
  }

  @Override
  public void sleep() {
    System.out.println("sleep");
  }

  @Override
  public void talk() {
    System.out.println("talk");
  }

  @Override
  public void walk() {
    System.out.println("walk");
  }
}
