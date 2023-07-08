package Setter_Getter;

public class Student_Runner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getNote());
        System.out.println(s1.getStId());
        System.out.println(s1.isResult());

        System.out.println("_____________________________________");

        s1.setNote(1.5);
        s1.setResult(true);
        s1.setStId("M3456788999");
        System.out.println(s1.getNote());
        System.out.println(s1.isResult());
        System.out.println(s1.getStId());
        System.out.println("===============================");


    }
}
