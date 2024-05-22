
import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades(){
        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }

    public static void main(String[] args) {
        Map<String, Integer> gradebook = getOriginalGrades();
        Map<String, Integer> makeupGrades = getMakeUpGrades();

        gradebook.forEach( (student, originalGrade) -> {
            Integer makeupGrade = makeupGrades.get(student);
            if(makeupGrade > originalGrade){
                gradebook.put(student, makeupGrade);
            }
            System.out.println(student + ": " + gradebook.get(student));
        });
    }
}