//this is a sample code to show inheritance implementations in OOPS
---------------------------------------------------------------

  // Animal class (parent)
public class Animal {
    void sound() {
      System.out.println("The animal makes a sound.");
    }
  }
  
  // Dog class (child) that inherits from Animal
  public class Dog extends Animal {
    void sound() {
      System.out.println("The dog barks.");
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.sound(); // Output: The dog barks.
    }
  }
