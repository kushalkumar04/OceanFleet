import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    // UC2: List to store vessels
    private List<Vessel> vesselList = new ArrayList<>();

    // Getter for vesselList
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    // Setter for vesselList
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // UC2: Add vessel performance
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // UC3: Retrieve vessel by vesselId (case-sensitive)
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null; // if vessel not found
    }
}
