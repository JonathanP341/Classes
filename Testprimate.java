public class Testprimate {
   public static void main(String [] args) {
      
      //making new primate and inputing values
      Primate primate1 = new Primate();
      primate1.name = "Curious George";
      primate1.species = "Monkey";
      primate1.size = "Small";
      primate1.colour = "Brown";
      primate1.favFood = "Bananas";
      primate1.age = 75;
      primate1.weight = 20;
      primate1.sex = 'M';
      primate1.aggressive = true;
      
      //Telling it to sleep for 7.5 hours
      primate1.sleep(7.5);
      
      //Making it climb a 34m high tree
      System.out.println("");
      primate1.climb("tree", 34);
      
      //Making the monkey say oo aa oo aa
      System.out.println("");
      primate1.communicate("oo aa oo aa");
      
      //Printing out the monkeys values/info
      System.out.println("\nThe " + primate1.species + "'s name is " + primate1.name);
      System.out.println("The " + primate1.species + " is " + primate1.size + " and " + primate1.colour);
      System.out.println(primate1.name + " is " +  primate1.age + " years old and " + primate1.weight + "kg.");
      System.out.println(primate1.name + "'s favourite food is " + primate1.favFood);
      if (primate1.aggressive == true) { //If statement for if it is aggressive or not
         System.out.println("The aggressive " + primate1.species + " is " + primate1.sex);
      }
      else {
         System.out.println("The non-aggressive " + primate1.species + " is " + primate1.sex);
      }
      
      
   }
}
