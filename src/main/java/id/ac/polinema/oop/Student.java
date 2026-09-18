package id.ac.polinema.oop;

/**
 * Student class.
 *
 * TASK: Complete every section marked TODO below.
 * Do not change the class name, method names, or method signatures —
 * the autograder calls them exactly as defined here.
 */
public class Student {

    // TODO: add fields: studentId (String), name (String), gpa (double)
    String studentId;
    String name;
    double gpa; //adsa
    /**
     * Student constructor.
     *
     * @param studentId Student identification number
     * @param name      Student's full name tes
     * @param gpa       Grade Point Average (0.0 - 4.0)
     */
    public Student(String studentId, String name, double gpa) {
        // TODO: store parameters into fields
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentId() {
        // TODO: return studentId
        return this.studentId;
    }

    public String getName() {
        // TODO: return name
        return this.name;
    }

    public double getGpa() {
        // TODO: return gpa
        return this.gpa;
    }

    /**
     * Determines the graduation predicate based on GPA:
     * - gpa >= 3.5           -> "Cum Laude"
     * - 3.0 <= gpa < 3.5     -> "Very Satisfactory"
     * - gpa < 3.0            -> "Satisfactory"
     *
     * @return graduation predicate
     */
    public String getPredicate() {
        // TODO: implement the predicate logic per the rules above
        if (this.gpa >= 3.5) {
            return "Cum Laude";
        } else if (this.gpa >= 3.0) {
            return "Very Satisfactory";
        } else {
            return "Satisfactory";
        }
    }
}
