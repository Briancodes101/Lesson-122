class Student {
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void displayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}

class Main {
    public static void main(String[] args) {
        Student st1 = new Student(); // Default constructor
        Student st2 = new Student(45, "Ashish"); // Constructor with 2 parametes; id and name
        Student st3 = new Student(256, "Cody", 10000); // Constructor with 3 parameters; id, name and stipend
        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
    }
}