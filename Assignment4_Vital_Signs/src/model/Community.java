package model;

/**
 *
 * @author kosuri
 */
public class Community {
    
    private String communityName;
    private City city;

    public String getCommunityName() {
        return communityName;
    }

    
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Community(String communityName, City city) {
        this.communityName = communityName;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
    
}