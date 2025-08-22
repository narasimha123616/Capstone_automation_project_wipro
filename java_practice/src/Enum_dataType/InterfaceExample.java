package Enum_dataType;

interface Vehicle {


 void start();
 void stop();
}

 enum type implements Vehicle {
 BIKE{
 public void start() {
     System.out.println("bike");
  }
 public void stop() {
     System.out.println("bike");
  }

 },

 CAR{
 public void start() {
     System.out.println("Car");
 }
 public void stop() {
     System.out.println("Car");
 }
};

 }
public class InterfaceExample {
 public static void main(String[] args) {
      type s = type.BIKE;
       s.start();
       s.stop(); 
 }
}
 

