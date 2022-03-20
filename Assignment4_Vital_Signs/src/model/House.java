package model;
import model.Community;
import model.City;

/**
 *
 * @author kosuri
 */
public class House {
    
    private String Hno;
    private String street;
    private Community community;
    private String state;
    private int zipcode;

    public House(String Hno, String street, Community community, String state, int zipcode) {
        this.Hno = Hno;
        this.street = street;
        this.community = community;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getHno() {
        return Hno;
    }

    public void setHno(String Hno) {
        this.Hno = Hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
       
    
}
