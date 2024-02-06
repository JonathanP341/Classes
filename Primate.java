public class Primate {
   /* Attributes */
   String name;
   String species;
   String size;
   String colour;
   String favFood;
   int age;
   double weight;
   char sex;
   boolean tired = true;
   boolean aggressive;
   
   //General constructor
   public Primate(String name, String species, String size, String colour, String favFood, int age, double weight, char sex, boolean aggressive) {
      this.name = name;
      this.species = species;
      this.size = size;
      this.colour = colour;
      this.favFood = favFood;
      this.age = age;
      this.weight = weight;
      this.sex = sex;
      this.aggressive = aggressive;    
   }
   
   //Default constructer
   public Primate() {
      this.name = "George";
      this.species = "Chimp";
      this.size = "Medium";
      this.colour = "Black";
      this.favFood = "leaves";
      this.age = 15;
      this.weight = 50;
      this.sex = 'N';
      this.aggressive = true;
   }
   
   //Time slept, see if the monkey is still tired
   public void sleep(double timeSlept) {
      System.out.println("The " + species + " slept for " + timeSlept + " hours.");
      
      if (timeSlept >= 6) {
         System.out.println(name + " isnt tired anymore.");
         tired = false;
      }
      else {
         System.out.println(name + " is still tired.");
         tired = true;
      }
   }
   
   //Checking for the thing the monkey climbed and the how high it climbed
   public void climb(String object, int heightObj) {
      if (heightObj > 35) {
         System.out.println("The " + species + " climbed a " + heightObj + "m high " + object);
         System.out.println("This height is too high for " + name);
      }
      else if (heightObj > 15) {
         System.out.println("The " + species + " climbed a " + heightObj + "m high " + object);
         System.out.println("This height is just right for " + name);
      }
      else {
         System.out.println("The " + species + " climbed a " + heightObj + "m high " + object);
         System.out.println("This height is too low for " + name);

      }
   }
   
   //Outputting what the primate said
   public void communicate(String words) {
      if (aggressive == true) {
         System.out.println("The " + this.species + " screamed " + words);
      }
      else {
         System.out.println("The " + this.species + " said " + words);
      }
   }
   
}
