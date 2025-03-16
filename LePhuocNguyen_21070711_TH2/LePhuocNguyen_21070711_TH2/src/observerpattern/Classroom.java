package observerpattern;


import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Observer> students = new ArrayList<>();
    private String className;

    public Classroom(String className) {
        this.className = className;
    }

    // Thêm sinh viên vào danh sách quan sát
    public void addStudent(Observer student) {
        students.add(student);
    }

    // Xóa sinh viên khỏi danh sách quan sát
    public void removeStudent(Observer student) {
        students.remove(student);
    }

    // Thông báo tất cả sinh viên về một thông báo mới
    public void notifyStudents(String message) {
        for (Observer student : students) {
            student.update(message);
        }
    }

    // Phát thông báo từ lớp trưởng
    public void broadcastMessage(String message) {
        System.out.println("Lớp trưởng thông báo: " + message);
        notifyStudents(message);
    }
}
