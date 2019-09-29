package coursesystem;

public class Course {

    public String name;
    public Student[] participants;
    public int StudentCount = 0;

    public Course(String name1) {
        name = name1;
        participants = new Student[100];
    }

    public void enroll(Student std) {
        participants[StudentCount] = std;
        StudentCount++;

    }

    public void remove(Student std) {
        for (int i = 0; i < StudentCount; i++) {
            if (participants[i].id == std.id) {
                StudentCount--;
                if (i == StudentCount) {
                    participants[i] = null;
                } else {
                    for (int j = i + 1; j <= StudentCount; j++) {
                        participants[j - 1] = participants[j];
                        participants[j] = null;
                    }
                }

            }

        }
    }

    public Student[] getParticipant() {
        Student[] stds = new Student[StudentCount];
        stds = participants.clone();

        return stds;
    }
}
