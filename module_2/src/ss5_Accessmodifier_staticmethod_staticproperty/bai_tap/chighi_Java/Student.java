package ss5_Accessmodifier_staticmethod_staticproperty.bai_tap.chighi_Java;

public class Student {
    private String name = "Nguyễn Lê Văn Khải";
    private String classes = "C10";

    Student() {

    }

    Student(String n, String cl) {
        name = n;
        classes = cl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
