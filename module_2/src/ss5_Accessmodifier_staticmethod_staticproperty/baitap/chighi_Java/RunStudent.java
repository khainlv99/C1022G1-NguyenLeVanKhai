package ss5_Accessmodifier_staticmethod_staticproperty.baitap.chighi_Java;

public class RunStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClasses("C1022G1");
        student1.setName("Đẹp trai");
        System.out.println("Name: " + student1.getName() );
        System.out.println("Class: " + student1.getClasses() );

        Student student2 = new Student("12/9","NLVK");
        System.out.println("Name: "+ student2.getName());
    }
}
