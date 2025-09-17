import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(int id, String name, int credits) {
        for (Course c : courses) {
            if (c.id == id) {
                System.out.println("Error: ya existe un curso con id " + id);
                return;
            }
        }
        courses.add(new Course(id, name, credits));
    }

    public Course getCourseById(int id) {
        for (Course c : courses) {
            if (c.id == id) return c;
        }
        return null;
    }

    public boolean removeCourse(int id) {
        Course c = getCourseById(id);
        if (c != null) {
            c.clearList();
            courses.remove(c);
            System.out.println("Curso eliminado correctamente.");
            return true;
        }
        return false;
    }

    public void listCourses() {
        for (Course c : courses) {
            System.out.println(c.id + " - " + c.name + " (" + c.credits + " créditos)");
        }
    }
}
