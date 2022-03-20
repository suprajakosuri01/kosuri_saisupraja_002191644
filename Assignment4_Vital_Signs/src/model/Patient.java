package model;

/**
 *
 * @author kosuri
 */

public class Patient extends Person{
    
    private String patientId;
    private EncounterHistory encounterHistory;

    public Patient(String firstName, String lastName, String phoneNumber, String sex, int age, House house, String patientId) {
        super(firstName, lastName, phoneNumber, sex, age, house);
        this.patientId = patientId;
        this.encounterHistory = new EncounterHistory();
        
    }

    public void addEncounter(Encounter encounter){
        
        encounterHistory.addEncounter(encounter);
    }
     
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

   

   
   
    
}

