package week3;

public class LecturerDemo03 {
    public static void main(String[] args) {
        Lecturer03[] lecturers = {
        };
        LecturerData03 data = new LecturerData03();
        data.showAllLecturerData(lecturers);
        data.countLecturerByGender(lecturers);
        data.averageLecturerAgeByGender(lecturers);
        data.showOldestLecturerInfo(lecturers);
        data.showYoungestLecturerInfo(lecturers);
    }
}