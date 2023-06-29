public class Student {
    String name;
    int usn;
    Student(String name){
        System.out.println("student name is "+ name +" and usn is "+ usn);
    } 
    public static void main(String[] args) {
        System.out.println("running main method of student");
        Student s1 = new Student("shree");
        Student s2 = new Student("vinod");
        Student s3 = new Student("shekhar");
        Student s4 = new Student("nitish");
        Student s5 = new Student("akash");
        Student s6 = new Student("alice");
        Student s7 = new Student("jacob");
        Student s8 = new Student("harry");
        Student s9 = new Student("ritesh");
        Student s10 = new Student("varun");
        
    }
}

class Fruit{
    String name;
    Fruit(String name, int usn){
        System.out.println("student name is "+ name +" and usn is "+ usn);
    }
	public static void main(String[] args) {
    System.out.println("Main method of Fruit");
    Fruit one = new Fruit("apple");
    Fruit two = new Fruit("mango");
    Fruit three = new Fruit("banana");
    Fruit four = new Fruit("grapes");
    Fruit five = new Fruit("custardapple");
    Fruit six = new Fruit("strawberry");
    Fruit seven = new Fruit("pineapple");
    Fruit eight = new Fruit("cherry");
    Fruit nine = new Fruit("guava");
    Fruit ten = new Fruit("chickoo");
}
}

class Phone{
    String mobile;
    Phone(String mobile)
    {
        System.out.println( "phone name: " + mobile);
    } 
public static void main(String[] args) {
    System.out.println("Main method of Phone");
    Phone p1=new Phone("s23 ultra"); 
    Phone p2=new Phone("iphone14");
    Phone p3=new Phone("pixel7a");
    Phone p4=new Phone("oneplus11");
    Phone p5=new Phone("minote12pro");
    Phone p6=new Phone("xiomi13pro");
    Phone p7=new Phone("pixel7pro");
    Phone p8=new Phone("galaxyzfold");
    Phone p9=new Phone("galaxyf54");
    Phone p10=new Phone("realme11pro");    
}
}


class ItCompany{
    String company;
    ItCompany(String company)
    {
        System.out.println( "company name: " + company);
    } 
public static void main(String[] args) {
    System.out.println("Main method of company... some IT companies of bangalore are");
    ItCompany company1=new ItCompany("TCS");
    ItCompany company2=new ItCompany("Infosys");
    ItCompany company3=new ItCompany("accenture");
    ItCompany company4=new ItCompany("oracle");
    ItCompany company5=new ItCompany("lg");
    ItCompany company6=new ItCompany("wipro");
    ItCompany company7=new ItCompany("IBM");
    ItCompany company8=new ItCompany("cognizant");
    ItCompany company9=new ItCompany("capgemini");
    ItCompany company10=new ItCompany("amazon");
}
}

class College{
    String company;
    College(String institute)
    {
        System.out.println( "college name: " + institute);
    }    
public static void main(String[] args) {
    System.out.println("Main method of company... some IT companies of bangalore are");
    College name1=new College("reva");
    College name2=new College("nmit");
    College name3=new College("vishveshwaraya");
    College name4=new College("brce");
    College name5=new College("oxford");
    College name6=new College("bms");
    College name7=new College("bnmit");
    College name8=new College("dsu");
    College name9=new College("amc");
    College name10=new College("acs");
}
}
