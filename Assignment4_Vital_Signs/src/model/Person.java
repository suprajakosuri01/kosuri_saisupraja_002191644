package model;

/**
 *
 * @author kosuri
 */
public class Person {
	
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String sex;
    private int age;
    private House house;
    

    public Person(String firstName, String lastName, String phoneNumber, String sex, int age, House house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
        this.house = house;
    }

    public String getFirstName() {
            return firstName;
    }


    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }


    public String getLastName() {
            return lastName;
    }


    public void setLastName(String lastName) {
            this.lastName = lastName;
    }

    public String getPhoneNumber() {
            return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
    }


    public String getSex() {
            return sex;
    }


    public void setSex(String sex) {
            this.sex = sex;
    }


    public int getAge() {
            return age;
    }


    public void setAge(int age) {
            this.age = age;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
       	
}

