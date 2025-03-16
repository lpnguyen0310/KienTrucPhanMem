package main;

import observerpattern.Classroom;
import observerpattern.Student;

public class Main {
    public static void main(String[] args) {
        // Tạo lớp học
        Classroom classroom = new Classroom("Lớp 12A");

        // Tạo sinh viên
        Student student1 = new Student("Nguyễn Văn A");
        Student student2 = new Student("Trần Thị B");
        Student student3 = new Student("Lê Minh C");

        // Đăng ký sinh viên vào lớp học
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        // Lớp trưởng phát thông báo
        classroom.broadcastMessage("Ngày mai thi toán, các bạn chuẩn bị nhé!");

        // Lớp trưởng phát thêm thông báo khác
        classroom.broadcastMessage("Học bù vào thứ 7 tuần này.");
    }
}
