
package model;
/**
 *
 * @author kosuri
 */
import java.util.ArrayList;
import java.util.List;

public class EncounterHistory {
	
private List<Encounter> encounterDirectory;
	
	
    EncounterHistory ()
    {
            encounterDirectory = new ArrayList<>();
    }


    public void addEncounter(Encounter encounter)
    {
            encounterDirectory.add(encounter);
    }

    public List<Encounter> getEncounterDirectory() {
            return encounterDirectory;
    }
	
    public void removeEncounterAtIndex(int i){
        
        if (i >= 0 && i < encounterDirectory.size()){
            encounterDirectory.remove(i);
        }
    }

}
