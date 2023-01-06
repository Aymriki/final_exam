public class Main {
    public static void main(String[]orgs){
    Customer customer;
    RegularCustomer regularcustomer = new RegularCustomer("Nami", 200000);
    SeniorCustomer  seniorcustomer = new SeniorCustomer("Brook", 2000);
    
    customer = regularcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    
    customer = seniorcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    }
    
}
