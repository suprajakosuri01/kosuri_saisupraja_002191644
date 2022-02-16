
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Fleet {
    
    public List<Car> carList;
    
    String configFilePath = "carData.csv";

    public Fleet() {
        
        carList = new  ArrayList<Car>();
        readCarsFromConfig();
    }
    
    
    
    public void addCar(Car car){
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
    
    public void readCarsFromConfig(){

        String seperator = ",";
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(configFilePath));  
            String carInfo = "";
            
            while ((carInfo = br.readLine()) != null)    
            {  
                String[] carInfoList = carInfo.split(seperator);
                
                
                String manufacturer = carInfoList[0];
                int year = Integer.parseInt(carInfoList[1]);
                int seats = Integer.parseInt(carInfoList[2]);
                String model = carInfoList[3];
                String avail = carInfoList[4].trim();
                String maintenance = carInfoList[5].trim();
                String city = carInfoList[6];
                String serialNumber = carInfoList[7];

                carList.add(new Car(manufacturer,seats,model,serialNumber,year,city,avail,maintenance));
            
             }  

            
        } 
        catch (IOException e)   
        {  
        e.printStackTrace();  
        } 
        
        
        
    }
    
    public List<Car> getAvailableCars(){
        
        List<Car> availableCars = new ArrayList<Car>();
        
        for(Car car : carList){
            if(car.getAvail().equals("YES")) {
                
                availableCars.add(car);
            }
        }
        
        return availableCars;
    }
    
    public List<Car> getUnAvailableCars(){
        
        List<Car> unAvailableCars = new ArrayList<Car>();
        
        for(Car car : carList){
            if(car.getAvail().equals("NO")) {
                
                unAvailableCars.add(car);
            }
        }
        
        return unAvailableCars;
    }
    
    
    public List<Car> getFirstAvailableCar(){
        
        List<Car> firstAvailableCar = new ArrayList<Car>();
        
        for(Car car : carList){
            if(car.getAvail().equals("YES")) {
                
                firstAvailableCar.add(car);
                break;
            }
        }
        
        return firstAvailableCar;
    }
    
    public List<String> getManufactutrers(){
        
        List<String> manufacturers = new ArrayList<String>();
        
        Set<String> set = new HashSet<>();
        
        for(Car car: carList){
            set.add(car.getManufacturer());
        }
        
        manufacturers.addAll(set);
        return manufacturers;   
    }
    
    public boolean verifySerialNumber(String sno){
        
        for(Car car : carList){
           
                
            if(sno.equals(car.getSerialNumber()))
            {
                return false;
            }
                
        }
        return true;
    }
    
    
    
}
