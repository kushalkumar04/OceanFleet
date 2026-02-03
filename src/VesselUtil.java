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
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceList = new ArrayList<>();

        if (vesselList.isEmpty()) {
            return highPerformanceList;
        }

        double maxSpeed = vesselList.get(0).getAverageSpeed();

        // Step 1: find maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Step 2: collect vessels with maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformanceList.add(vessel);
            }
        }

        return highPerformanceList;
    }

}
