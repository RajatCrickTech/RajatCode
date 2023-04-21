package Hierarchial;

public class Asia {
    void NameOfContinent(){
        System.out.println("This is Asia ");
    }
}
class Indiaa extends Asia{
    void CountryName1(){
        System.out.println("This is country");
    }
}
class Pakistann extends Indiaa{
    void CountryName2(){
        System.out.println("This is 2 country");
    }
}

class Inheritancee{
    public static void main(String[] args) {
        Pakistann ob3=new Pakistann();
        ob3.NameOfContinent();
        ob3.CountryName2();
        ob3.CountryName1();

    }
}