package solid.dependency_inversion;

public class CustomerDataAccess implements ICustomerDataAccess {

  @Override
  public String getCustomerName(int id) {
    return "Dummy Customer Name " + id;
  }
}
