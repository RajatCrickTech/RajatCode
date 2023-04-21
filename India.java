package Hierarchial;

public class India {
    void methodIndia(){
        System.out.println("Jai Hind");
    }
}
class Pakistan extends India{
    void methodPakistan(){
        System.out.println("this is pakistan");
    }
}
 class Bangladesh extends India{
    void methodBangladesh(){
        System.out.println("Iam in Bangladesh");
    }
 }
 class Afghanistan extends India{
    void methodAfghanistan(){
        System.out.println("this is Afghanistan");
    }
 }
  class HierarchyInheritance{
      public static void main(String[] args) {
          Pakistan ob1=new Pakistan();
          ob1.methodIndia();
          ob1.methodPakistan();
          Bangladesh ob2=new Bangladesh();
          ob2.methodBangladesh();
          ob2.methodIndia();
          Afghanistan ob3=new Afghanistan();
          ob3.methodAfghanistan();
          ob3.methodIndia();
      }
  }
