import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Subject> subjects = SubjectManager.readSubjects(Consts.subjectsPath);
        System.out.println(subjects);
    }
}
