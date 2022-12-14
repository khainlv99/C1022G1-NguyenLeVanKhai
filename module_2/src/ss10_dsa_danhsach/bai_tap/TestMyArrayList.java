package ss10_dsa_danhsach.bai_tap;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1,"Khai");
        Student student1 = new Student(2,"Khai1");
        Student student2 = new Student(3,"Khai2");
        Student student3 = new Student(4,"Khai3");
        Student student4 = new Student(5,"Khai4");
        Student student5 = new Student(6,"Khai5");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
        studentMyArrayList.add(student2,2);
        studentMyArrayList.size();
        System.out.println(studentMyArrayList.size());
        for (int i = 0; i<studentMyArrayList.size();i++){
            Student student7 = (Student) studentMyArrayList.elements[i];
            System.out.println(student7.getId());
            System.out.println(student7.getName());
        }
    }
}
