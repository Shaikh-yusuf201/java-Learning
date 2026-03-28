package chatgpt_task;
class student {
    private int id ;
    private String name;
    private double marks;

    public student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    void display(){
        System.out.println("The Name is : "+name+" and id is : "+id+" with "+marks+" Marks");
    }
}

class person extends student{
     person(student s){
         super(s.getId() , s.getName() , s.getMarks());
     }
    public void Check(student s){
       if(s.getMarks() >=40){
           System.out.println("pass");
       }
       else{
           System.out.println("fail");
       }
    }
}
public class Chatgpt_task1 {
    public static void main(String[] args) {
  student s1 = new student(1,"yusuf" , 85);
  student s2 = new student(2,"rehan" , 75);
  student s3 = new student(3,"hasan" , 35);
  person p1 = new person(s1);

   s1.display();
   p1.Check(s1);
   s2.display();
   p1.Check(s2);
   s3.display();
   p1.Check(s3);
    }
}
