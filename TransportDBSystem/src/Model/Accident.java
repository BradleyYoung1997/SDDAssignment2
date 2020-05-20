package Model;

/*
 * Author: Bradley Young 12110283
 * Date:
 * Purpose: 
 */
public class Accident 
{
    
    private String location;
    private String comments;
    private int numVehicles;
    private String numPlate;
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    public void setComments(String comments)
    {
        this.comments = comments;
    }
    public void setNumVehicles(int numVehicles)
    {
        this.numVehicles = numVehicles;
    }
    public void setNumPlate(String numPlate)
    {
        this.numPlate = numPlate;
    }
    public String getLocation()
    {
        return location;
    }
    public String getComments()
    {
        return comments;
    }
    public int getNumVehicles()
    {
        return numVehicles;
    }
    public String getNumPlate()
    {
        return numPlate;
    }
    public String toString()
    {
        return "Location: " + getLocation() + "Comments: " + getComments() + 
                "Number of Cars: " + getNumVehicles() + " Number Plate(s): "
                + getNumPlate();
    }
}
