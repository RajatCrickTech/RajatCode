import java.util.Scanner;

public class Puppy
 {

    int puppyAge;
    int x=5;
    public void Puppy (String name)
    {
        System.out.println("The Name of Puppy "+name);
    }

   public  int setAge(int age)
  {
    int puppyAge=age;
    System.out.println(puppyAge);

    return puppyAge;


  }
   public int getAge()
     {


        return puppyAge;
     }


      public static void main(String []args)
        {
            Puppy gut = new Puppy ();
            gut.setAge(2);
            gut.Puppy("Rajat");
            gut.getAge();

        }
 }


