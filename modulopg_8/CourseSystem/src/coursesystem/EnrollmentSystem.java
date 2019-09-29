package coursesystem;

public class EnrollmentSystem {

    public Student[] students;
    public Course[] courses;
    public int studentCount = 0;

    public EnrollmentSystem(Course crs) {
        students = new Student[100];
        courses = new Course[30];

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = crs;
                break;
            } else {
                break;
            }
        }
    }

    public void removeCourse(Course crs) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {

                if (courses[i] == crs) {
                    courses[i] = null;
                    System.out.println(crs.name + " has been removed.");
                    break;
                }
            }
        }
    }

    public void AddCourse(Course crsinput) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = crsinput;
                break;
            } else {
                continue;
            }
        }

    }

    public void removeStudent(Student std) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i] == std) {
                    students[i] = null;
                    System.out.println(std.name + " Has been removed.");
                    break;
                }
            }
        }
    }

    public void AddStudent(Student std) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = std;
                break;

            } else {
                continue;
            }
        }
    }

    public void enroll(Student std, Course crs) {
        crs.enroll(std);
    }

    public void remove(Student std, Course crs) {
        crs.remove(std);
    }

    public void showParticipants(Course crs) {
        System.out.println("Showing particinpants for " + crs.name + ":");
        Student[] stds = crs.getParticipant();
        for (int i = 0; i < stds.length; i++) {
            if (stds[i] != null) {
                System.out.println(stds[i].name);
                continue;
            } else {
                break;
            }

        }

    }

    public void getCourses() {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                System.out.println(courses[i].name);
            }
        }
    }

    public void getStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].name);
            }
        }
    }
}
