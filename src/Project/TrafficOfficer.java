package Project;
import java.util.List;
import java.util.ArrayList;
public class TrafficOfficer {


















  
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
