package Project;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author mahmo
 */
import java.util.ArrayList;
import java.util.List;

public class Owner {
    private int id;
    private String name;
    private String contactInfo;
    private List<String> vehicles;

 
    public Owner(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.vehicles = new ArrayList<>();
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

  public void addVehicle(String vehicle) {
        vehicles.add(vehicle);

  }
    public void removeVehicle(String vehicle) {
        vehicles.remove(vehicle);
    }
}
  

