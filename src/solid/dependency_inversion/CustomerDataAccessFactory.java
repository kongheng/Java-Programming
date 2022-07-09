package solid.dependency_inversion;

public class CustomerDataAccessFactory {
  public static CustomerDataAccess getInstanceOfCustomerDataAccess() {
    return new CustomerDataAccessImpl();
  }
}
