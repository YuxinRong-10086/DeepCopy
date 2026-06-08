public class Main {

    public static void main(String[] args) {

        try {

        Address address = new Address("123 Main St","Apt 1","Seattle",State.WA,"98001");

        Student student1 =new Student("John","Smith",address,1001L);

            student1.addClass("Art");
            student1.addClass("Chemistry");
            student1.addClass("PE");
            student1.addClass("English");

        Student student2 = new Student(student1);

        student2.setFirstName("Jane");
        student2.setStudentId(1002L);

        student2.removeClass("Art");
        student2.addClass("Band");

        System.out.println("STUDENT 1");
        System.out.println(student1);

        System.out.println("\n");

        System.out.println("STUDENT 2");
        System.out.println(student2);

    }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
