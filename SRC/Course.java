public class Course {
    int id;
    String name;
    int credits;
    Student head; // referencia al primer nodo de la lista

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits > 0 ? credits : 1; // validación mínima
        this.head = null;
    }

    public boolean addStudent(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return true;
        }

        Student current = head;
        while (current != null) {
            if (current.idNumber.equals(newStudent.idNumber)) {
                System.out.println("Error: Alumno con idNumber " + newStudent.idNumber + " ya existe.");
                return false;
            }
            current = current.next;
        }

        if (newStudent.idNumber.compareTo(head.idNumber) < 0) {
            newStudent.next = head;
            head = newStudent;
            return true;
        }

        Student prev = null;
        current = head;
        while (current != null && current.idNumber.compareTo(newStudent.idNumber) > 0) {
            prev = current;
            current = current.next;
        }
        prev.next = newStudent;
        newStudent.next = current;
        return true;
    }

    public boolean updateStudent(String idNumber, String firstName, String lastName, int semester, String program) {
        Student current = head;
        while (current != null) {
            if (current.idNumber.equals(idNumber)) {
                current.firstName = firstName;
                current.lastName = lastName;
                current.semester = semester;
                current.program = program;
                System.out.println("Alumno con idNumber " + idNumber + " actualizado correctamente.");
                return true;
            }
            current = current.next;
        }
        System.out.println("Alumno con idNumber " + idNumber + " no encontrado.");
        return false;
    }

    public boolean removeStudent(String idNumber) {
        if (head == null) return false;

        if (head.idNumber.equals(idNumber)) {
            head = head.next;
            return true;
        }

        Student prev = null, current = head;
        while (current != null && !current.idNumber.equals(idNumber)) {
            prev = current;
            current = current.next;
        }
        if (current == null) return false;

        prev.next = current.next;
        current.next = null;
        return true;
    }

    public void listStudents() {
        if (head == null) {
            System.out.println("No hay alumnos inscritos en " + name);
            return;
        }
        Student current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void clearList() {
        Student current = head;
        while (current != null) {
            Student temp = current;
            current = current.next;
            temp.next = null;
        }
        head = null;
    }
}
