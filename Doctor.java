class Doctor{

    String Name;
    String Specialzation;
    Integer Age;

    Doctor(String Name , String Specialzation , Integer Age){
        this.Name = Name;
        this.Specialzation = Specialzation;
        this.Age = Age;
    
    }

    public void printinfo() {
        System.out.println(Name);
        
    }

}


class OOPS{
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Ramesh", "heart", 23);
        Doctor doc2 = new Doctor("Mahesh", "Eye", 30);
        doc1.printinfo();
        doc2.printinfo();


    }

}
