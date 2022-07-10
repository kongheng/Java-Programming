package solid.dependency_inversion;

public class CustomerDataAccessImpl implements CustomerDataAccess {

  @Override
  public String getCustomerName(int id) {
    return "Dummy Customer Name " + id;
  }
}
