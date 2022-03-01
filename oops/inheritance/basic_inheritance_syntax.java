class Basic_inheritance_syntax {
    public static void main(String[] args) {
       Student_1_data_assignment obj = new  Student_1_data_assignment(324327,"pavan");

    }
}
class Student_1_data_assignment{
      int id;
      String name;
    student(int i,String n) {
        id=i;
        name=n;
        
    }
}
class Student1_data_display extends Student_1_data_assignment{
    void display() {
        System.out.println(id + " " + name);

    }
}