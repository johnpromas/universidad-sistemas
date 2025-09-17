public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        manager.addCourse(1, "Estructuras de Datos", 4);
        manager.addCourse(2, "POO", 3);

        Course estructuras = manager.getCourseById(1);

        estructuras.addStudent(new Student("Ana", "García", "1001", 3, "Sistemas"));
        estructuras.addStudent(new Student("Luis", "Martínez", "1002", 2, "Sistemas"));
        estructuras.addStudent(new Student("Carlos", "Zapata", "0999", 1, "Industrial"));

        System.out.println("Alumnos en Estructuras de Datos:");
        estructuras.listStudents();

        estructuras.addStudent(new Student("Pedro", "Ramírez", "1002", 2, "Civil"));
        estructuras.updateStudent("1002", "Luis", "Martínez", 3, "Telecomunicaciones");

        estructuras.removeStudent("0999");

        System.out.println("\nDespués de actualizar y eliminar:");
        estructuras.listStudents();

        manager.removeCourse(1);
        System.out.println("\nDespués de eliminar el curso:");
        estructuras.listStudents();
    }
}
