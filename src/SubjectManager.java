import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager {

    public static ArrayList<Subject> readSubjects(String path) {
        ArrayList<Subject> subjects = new ArrayList<>();

        String file = readString(path);
        file = file.replaceAll(" ", "");

        String[] subj = file.split(",");

        for (String s: subj) {
            String[] subId = s.split(":");
            String name = subId[0];

            if (subId.length==2) {
                String shortN = s.split(":")[1];
                subjects.add(new Subject(name, shortN));
            } else {
                subjects.add(new Subject(name));
            }
        }

        return subjects;

    }

    private static String readString(String path) {
        Scanner in = null;
        try {
            in = new Scanner(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        while(in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        return sb.toString().toLowerCase();
    }

}
