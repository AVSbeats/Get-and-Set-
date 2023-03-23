public class SomeStudent extends Student { // Child Class

    public static void display() {

        Student avs = new Student();

        avs.setIdNum(777);
        avs.setGpa(3.5);

        System.out.println("The student ID is " + avs.getIdNum() + " and GPA: " + avs.getGpa());
    }

}
