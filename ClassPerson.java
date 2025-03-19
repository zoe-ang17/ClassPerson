public class ClassPerson {

String Name; 
String Country;
String City;
int Age;

ClassPerson(String Name, String Country, String City, int Age){
this.Name = Name;
this.Country = Country;
this.City = City;
this.Age = Age;

}

void Character(){ 
    System.out.println("Hi, my name is " + this.Name + ", the " + this.Age + "-year-old teen from " + this.City +  " in " + this.Country + ".");

}

}
