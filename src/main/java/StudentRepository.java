import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private String[] studentDatabase = {"jon", "david", "elon", "michelle", "esther"};

    public List<String> getStudentsFromDatabase() {
        List <String> studentsFromDb = new ArrayList<>();
        for ( String student : studentDatabase) {
            studentsFromDb.add(student);
        }
        return null;
    }
}
