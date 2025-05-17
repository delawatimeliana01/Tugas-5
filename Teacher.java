public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 30;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses++] = course;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}