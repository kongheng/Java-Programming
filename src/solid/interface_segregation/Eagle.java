package solid.interface_segregation;

public class Eagle implements Bird {

  @Override
  public void fly() {
    System.out.println("fly");
  }

  @Override
  public void eat() {
    System.out.println("eat");
  }

  @Override
  public void sleep() {
    System.out.println("sleep");
  }
}
