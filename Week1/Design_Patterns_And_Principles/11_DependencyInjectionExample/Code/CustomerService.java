public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomer(int id) {
        Customer customer = repository.findCustomerById(id);
        System.out.println("Fetched: " + customer);
    }
}