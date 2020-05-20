package Model;

/*
 * Author: Bradley Young 12110283
 * Date:
 * Purpose: 
 */
public class Vehicle 
{
    private String numPlate;
    private String model;
    private int year;
    private String owner;
    private String address;
    private long phone;
    
    public Vehicle(String numPlate, String model, int year, String owner, 
                                                     String address, long phone)
    {
       this.numPlate = numPlate;
       this.model = model;
       this.year = year;
       this.owner = owner;
       this.address = address;
       this.phone = phone;
    }
        public void setNumPlate(String numplate)
        {
            this.numPlate = numPlate;
        }
        public void setModel(String model)
        {
            this.model = model; 
        }
        public void setYear(int year)
        {
            this.year = year;
        }
        public void setOwner(String owner)
        {
            this.owner = owner;
        }
        public void setAddress(String address)
        {
            this.address = address;
        }
        public void setPhone(long phone)
        {
            this.phone = phone;
        }
}
