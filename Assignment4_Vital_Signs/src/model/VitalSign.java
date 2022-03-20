package model;

/**
 *
 * @author kosuri
 */
public class VitalSign {
    
    int bp_systolic;
    int bp_diastolic;
    int pulse;

    public VitalSign(int bp_systolic, int bp_diastolic, int pulse) {
        this.bp_systolic = bp_systolic;
        this.bp_diastolic = bp_diastolic;
        this.pulse = pulse;
    }

    public int getBp_systolic() {
        return bp_systolic;
    }

    public void setBp_systolic(int bp_systolic) {
        this.bp_systolic = bp_systolic;
    }

    public int getBp_diastolic() {
        return bp_diastolic;
    }

    public void setBp_diastolic(int bp_diastolic) {
        this.bp_diastolic = bp_diastolic;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    
}
