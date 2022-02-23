package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * javadoc
 * Consumer<T> : Represents an operation that accepts a single input argument and returns no result.
 * BiConsumer<T, U> : Represents an operation that accepts two input arguments and returns no result.
 */
public class _Consumer {
    public static void main(String[] args) {
        // Normal java function
        System.out.println("//Normal java function");
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        greetCustomerV2(maria, true);

        // Consumer Functional interface
        System.out.println("//Consumer Functional interface");
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + " , thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + " , thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + " , thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + " , thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "********"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
