package solid.dependency_inversion;

public class CustomerBusinessLogic {

  CustomerDataAccess customerDataAccess;

  public CustomerBusinessLogic() {
    customerDataAccess = CustomerDataAccessFactory.getInstanceOfCustomerDataAccess();
  }

  public String getCustomerName(int id) {
    return customerDataAccess.getCustomerName(id);
  }

}
