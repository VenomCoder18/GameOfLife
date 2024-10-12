//Name: Riley Foster
//Date: 09/26/24
//CreatingYourWorker
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class CreatingYourWorker{

  String name;
  List <String> PlayerInventory = new ArrayList<String>();
  int JobsWorked;
  int age;
  int moneyMade;
  int hoursWorked;
  boolean isActive;
  String gender; 

  public CreatingYourWorker(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName(){
    return name; 
  }
  public int getAge(){
    return age;
  }
  public String getGender(){
    return gender;
  }
  public void setMoneyMade(int moneyMade){
    this.moneyMade = moneyMade;
  }
  public int getMoneyMade(){
    return moneyMade;
  }
  public void setIsActive(boolean isActive){
    this.isActive = isActive;
  }
  public boolean getActive(){
    return isActive;
  }
  public void setJobsWorked(int jobsWorked){
    this.JobsWorked = jobsWorked;
  }
  public int getJobsWorked(){
    return JobsWorked;
  }
  public void setHoursWorked(int HoursWorked){
    this.hoursWorked = HoursWorked;
  }
  public int getHoursWorked(){
    return hoursWorked;
  }
  public void addInventory(String inventory){
    PlayerInventory.add(inventory);
  }
  public List<String> getInventory(){
    return PlayerInventory;
  }

}