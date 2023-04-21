 class Chandigarh {
     void CityName() {
         System.out.println("iam in Chandigarh");
     }
 }
    class Infowiz extends Chandigarh{
        void InstituteName(){
            System.out.println("iam in infowiz");
        }

    }
    class javalab extends Infowiz{
        void LabName(){
            System.out.println("Iam in java Lab");
        }
    }

    class Inheritance
    {
        public  static void main(String[] args)
        {

            javalab obj=new javalab();
        obj.CityName();
        obj.InstituteName();
        obj.LabName();
            System.out.println("Next output: givenj below ");
        Infowiz ob1=new Infowiz();
        ob1.InstituteName();
        ob1.CityName();


    }}



