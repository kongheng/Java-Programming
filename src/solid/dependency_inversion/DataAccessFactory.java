package solid.dependency_inversion;

public class DataAccessFactory {
  public static ICustomerDataAccess getInstanceOfCustomerDataAccess() {
    return new CustomerDataAccess();
  }
}
