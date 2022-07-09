package solid.dependency_inversion;

public class CustomerBusinessLogic {

  ICustomerDataAccess customerDataAccess;

  public CustomerBusinessLogic() {
    customerDataAccess = DataAccessFactory.getInstanceOfCustomerDataAccess();
  }

  public String getCustomerName(int id) {
    return customerDataAccess.getCustomerName(id);
  }

}
