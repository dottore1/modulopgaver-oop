package coursesystem;

public class CourseSystem {

    public static void main(String[] args) {
        Course crs = new Course("OOP");
        Course crs1 = new Course("COS");
        Student std = new Student("Nichlas", 1);
        Student std1 = new Student("Mathias", 2);
        Student std2 = new Student("Anders", 3);
        Student std3 = new Student("Sonja", 3);
        EnrollmentSystem es = new EnrollmentSystem(crs);

        es.AddCourse(crs1);
        es.AddStudent(std);
        es.AddStudent(std1);
        es.AddStudent(std2);
        es.AddStudent(std3);

        es.enroll(std, crs);
        es.enroll(std1, crs1);
        es.enroll(std1, crs);
        es.enroll(std2, crs);

        es.getCourses();

        es.showParticipants(crs);
        es.showParticipants(crs1);

        es.remove(std, crs);

        es.showParticipants(crs);

        es.remove(std1, crs1);

        es.showParticipants(crs1);

        es.getStudents();

    }

}
