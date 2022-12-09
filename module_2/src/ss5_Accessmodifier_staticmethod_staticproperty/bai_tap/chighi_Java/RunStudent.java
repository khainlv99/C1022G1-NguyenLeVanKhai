package ss5_Accessmodifier_staticmethod_staticproperty.bai_tap.chighi_Java;

public class RunStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClasses("C1022G1");
        student1.setName("Khải");
        System.out.println("Name: " + student1.getName() );
        System.out.println("Class: " + student1.getClasses() );

        Student student2 = new Student("Nguyễn Lê Văn Khải","NLVK");
        System.out.println("Name: "+ student2.getName());
    }
}
