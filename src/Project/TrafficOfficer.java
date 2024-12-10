package Project;
import java.util.List;
import java.util.ArrayList;
public class TrafficOfficer {

    private String ID;
    private String name;
    private String contact_info;
    private String assigned_zone;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public String getAssigned_zone() {
        return assigned_zone;
    }

    public void setAssigned_zone(String assigned_zone) {
        this.assigned_zone = assigned_zone;
    }
  
  //traffic officer functions
    public void record_violation(Vehicle V,TrafficViolation violation, String date){
        TrafficViolation v=new TrafficViolation(V.getId(), violation.getViolationType(), date);
        List<Object> violations=new ArrayList<>();
        violations.add(v);
        System.out.println("Violation recorded successfully.");
    }
    public void view_violations(){
        List<TrafficViolation> violations=new ArrayList<>();
        if(violations.isEmpty()){
            System.out.println("no violations recorded.");
        }
        else{
            System.out.println("Recorded violations:");
            for(TrafficViolation v:violations){
                System.out.println(v);
            }
        }

    }
}
