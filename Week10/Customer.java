package uk.ac.mmu.dtsda.itp.lecture10.pizza;

/*
 * A class to represent a customer of a pizza shop
 */

public class Customer
{
  //the customer's name
  private String name;
  
  //the customer's address (for delivery)
  private String address;
  
  //the main constructor for a Customer - must supply a name and an address
  public Customer(String reqName, String reqAddress)
  {
    name = reqName;
    address = reqAddress;
  }

  //get the customer's name
  public String getName()
  {
    return name;
  }

  //get the customer's address
  public String getAddress()
  {
    return address;
  }
}
