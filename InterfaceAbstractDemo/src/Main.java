import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1, "Engin", "Demiro�", 1985, "11111111111"));

	}

}
