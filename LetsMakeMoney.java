//Name: Riley Foster
//Date: 09/26/24
//LetsMakeMoney

import java.util.Scanner;
import java.util.Arrays;

public class LetsMakeMoney {
  
  public static void main(String[] args){
 
    String whatToDo;
    String whatJob;
    String buyingStuff;

    WorkThingsToDo [] arr; 
    arr = new WorkThingsToDo[5];

    arr[0] = new WorkThingsToDo("Construction", 150, 15);
    arr[1] = new WorkThingsToDo("Nurse", 300, 24);
    arr[2] = new WorkThingsToDo("Retail", 50, 8 );
    arr[3] = new WorkThingsToDo("Military", 500, 48);
    arr[4] = new WorkThingsToDo("Barista", 75, 10); 

    CreatingYourWorker player_1 = playerCreation();

    player_1.setIsActive(true);
    player_1.setMoneyMade(0);

    System.out.println("Your charcter name is: " + player_1.getName() + "\n"
                        + player_1.getName() + " age is: " + player_1.getAge() + "\n"
                        + player_1.getName() +" is: " + player_1.getGender() + "\n"
                        + player_1.getName() + " has: " + player_1.getMoneyMade() + " dollars in account and has " +"\n"
                        + player_1.getInventory() + " items in inventory");


    int newmoney = 0;
    int jobsWorked = 0;
    int hoursWorking = 0;

    while(player_1.getActive() == true){

      Scanner letsDoStuff = new Scanner(System.in);
      Scanner whatJobToDo = new Scanner(System.in);
      Scanner whatToBuy = new Scanner(System.in);

      System.out.println("What would you like to do? Type 'help' for list of options");

      whatToDo = letsDoStuff.nextLine();
      whatToDo.toLowerCase();
     

      switch (whatToDo){

        case "work" :
          
          System.out.println("Choose a job: ");
          System.out.println("****************");

          for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getName());
          }

          System.out.println("****************");
          whatJob = whatJobToDo.nextLine();
          whatJob = whatJob.substring(0,1).toUpperCase() + whatJob.substring(1).toLowerCase();

          for(int x = 0; x < arr.length; x++){

            if(arr[x].getName().equals(whatJob)){
              System.out.println("You are working: " + arr[x].getName()); 
              newmoney += arr[x].getPay();
              hoursWorking += arr[x].getTimeUsed();
              jobsWorked += 1;

              player_1.setJobsWorked(jobsWorked);
              player_1.setMoneyMade(newmoney);
              player_1.setHoursWorked(hoursWorking);

              System.out.println(player_1.getName() + " has made " + player_1.getMoneyMade());
              System.out.println("****************");
              break;
            } else {
              continue;
            }
            
          }
          break;
        case "store": 
          System.out.println("Store!!!");
          System.out.println("****************");
          Store [] store = useTheStore();

          for(int x = 0; x < store.length; x++){
            System.out.println(store[x].display());
          }
          System.out.println("****************");
          System.out.println("What would you like to purchase? ");
          buyingStuff = whatToBuy.nextLine();
          buyingStuff = buyingStuff.substring(0,1).toUpperCase() + buyingStuff.substring(1).toLowerCase();

          for(int i = 0; i < store.length; i++){
            if(store[i].getName().equals(buyingStuff)){
              if(store[i].getCost() > player_1.getMoneyMade()){
                System.out.println("You do not have enough funds for this");
                System.out.println("****************");
                break;
              } else if(store[i].getCost() <= player_1.getMoneyMade()){
                player_1.addInventory(store[i].getName());
                player_1.setMoneyMade(player_1.getMoneyMade() - store[i].getCost());
                System.out.println("You have added " + store[i].getName() + " to your inventory");
                System.out.println("****************");
                break;
              }
            } else {
              continue;
            }
            System.out.println("Your new player inventory is: " + player_1.getInventory());
            break;
          }
          break;
        case "player stats": 
          System.out.println("Player Name: " + player_1.getName() + "\n" +
                             "is " + player_1.getAge() + " years old and " + player_1.getGender() + "\n" +
                             player_1.getMoneyMade() + " dollars in account" + "\n" +
                             player_1.getHoursWorked() + " hours worked" + "\n" +
                             player_1.getJobsWorked() + " total jobs worked" + "\n" +
                             player_1.getName() + " owns " + player_1.getInventory());
          break;
        case "help" : 
          HowToWorkGame();
          break;

        case "retire": 
          player_1.setIsActive(false);
          break;

      }
      
    }
    System.out.println("****************");
    System.out.println("Game Completed!!! " + "\n" +
                        player_1.getName() + " ended the game with: " + "\n" +
                        player_1.getMoneyMade() + " dollars in account and worked " + "\n" +
                        player_1.getJobsWorked() + " jobs in career, for " +player_1.getHoursWorked()+ " hours" +"\n" +
                        player_1.getName() + " owned " + player_1.getInventory());
    System.out.println("****************");
  }
  

  public static void HowToWorkGame(){
    
    System.out.println("********************");
    System.out.println("Store: Enter the Store to Buy things" );
    System.out.println("Work: Choose A Job to Make Money");
    System.out.println("Player Stats: See Who Your Character Is");
    System.out.println("Help: See These Settings");
    System.out.println("Retire: End The Game");
    System.out.println("********************");

  }

  public static CreatingYourWorker playerCreation(){

    String Name1;
    int age1;
    String gender1;
    int answers = 1; 
    CreatingYourWorker player_1;

    Scanner name = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    Name1 = name.nextLine();

    Scanner age = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age1 = age.nextInt();

    Scanner gender = new Scanner(System.in);
    System.out.println("Please enter male or female: ");
    gender1 = gender.nextLine();
    gender1.toLowerCase();

    for(int x = 0; x < answers; x++ ){
      if(gender1.equals("male") || gender1.equals("female")){
        System.out.println("You have created your character!");
      }else{
        System.out.println("You entered the wrong gender, please try again.");
        gender1 = gender.nextLine().toLowerCase();
        answers++;
      }
    }

    return player_1 = new CreatingYourWorker(Name1, age1, gender1);

  }
  public static Store [] useTheStore(){

    Store [] store = new Store[10];
    store[0] = new Store("Bike", 100);
    store[1] = new Store("Car", 1500);
    store[2] = new Store("Truck", 2000);
    store[3] = new Store("Small House", 100000);
    store[4] = new Store("Big House", 750000);
    store[5] = new Store("Dog", 500);
    store[6] = new Store("Cat", 300);
    store[7] = new Store("Turtle", 1000);
    store[8] = new Store("Pistol", 2500);
    store[9] = new Store("Ak-47", 3000);

    return store;

  }

}
