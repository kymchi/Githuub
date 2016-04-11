public class PersonDriver{
public static void main(String[]arg){


Person Samuel=new Person("Sam",30);
Person Herp = new Person();
Person Daniel=new Person("Daniel",25);
Person Samantha =new Person("Sam",34);
Person SamuelClone=new Person("Sam",30);



Person.equalName(Samuel,Samantha);
Person.equalAge(Samuel,Samantha);
Person.compareAge(Samuel,Samantha);
Person.equalName(Daniel,Samantha);
Person.equalAge(Daniel,Herp);
Person.equalAge(Daniel,Samantha);
Person.compareAge(Daniel,Samantha);
Person.equalPerson(Samuel,Samantha);
Person.compareAge(Daniel,Herp);
Person.equalPerson(Samuel,SamuelClone);







}
}
