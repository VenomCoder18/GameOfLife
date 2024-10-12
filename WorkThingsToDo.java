import java.util.Scanner;
import java.util.Arrays;

public class WorkThingsToDo {
  
  String name;
  int pay;
  int timeUsed;

  public WorkThingsToDo(String name, int pay, int timeUsed){

    this.name = name;
    this.pay = pay; 
    this.timeUsed = timeUsed;

  }
  public String getName(){
    return name;
  }
  public int getPay(){
    return pay;
  }
  public int getTimeUsed(){
    return timeUsed;
  }
}
