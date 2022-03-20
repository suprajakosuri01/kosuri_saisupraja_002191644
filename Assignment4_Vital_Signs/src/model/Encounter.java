package model;

/**
 *
 * @author kosuri
 */
import java.util.Date;
import java.time.LocalDate;




public class Encounter {
	
	private LocalDate date;
	private VitalSign vitalSign;

	
	/**
	 * @param date
	 * @param vitalSign
	 */
	public Encounter(LocalDate date, VitalSign vitalSign) {
		super();
		this.date = date;
		this.vitalSign = vitalSign;
	}
	
	
	public LocalDate getDate() {
		return date;
	}
	
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public VitalSign getVitalSign() {
		return vitalSign;
	}
	
	
	public void setVitalSign(VitalSign vitalSign) {
		this.vitalSign = vitalSign;
	}	

}
