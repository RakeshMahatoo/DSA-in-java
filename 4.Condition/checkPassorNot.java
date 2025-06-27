public class checkPassorNot{
    public static void main(String[] args) {
    int marks = 75;

    String status = (marks >=33 ) ? "pass" : "fail";
    //  shortcut of System.out.println();
    System.out.println("The student has " + status + "ed the exam.");
    }
}
