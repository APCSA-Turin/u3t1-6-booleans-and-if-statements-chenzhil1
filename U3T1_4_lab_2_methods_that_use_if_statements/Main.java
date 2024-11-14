package U3T1_4_lab_2_methods_that_use_if_statements;

public class Main {
    public static void main(String[] args) {
        SelectionMadness madness = new SelectionMadness();

        // test fortune
        System.out.println("---- testing fortune ----");
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());

        // test largest
        System.out.println("\n---- testing largest ----");
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        LetterGrade grader = new LetterGrade();
        String grade1 = grader.gradeV1(80);
        System.out.println(grade1);
        String grade2 = grader.gradeV2(80);
        System.out.println(grade2);
    }
    
}
