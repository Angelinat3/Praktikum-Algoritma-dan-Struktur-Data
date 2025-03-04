package week3;

public class LecturerData03 {

    public void showAllLecturerData(Lecturer03[] lecturerArray) {
        for (Lecturer03 lecturer : lecturerArray) {
            System.out.println(lecturer);
        }
    }

    public void countLecturerByGender(Lecturer03[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;
        for (Lecturer03 lecturer : lecturerArray) {
            if (Boolean.TRUE.equals(lecturer.getGender())) {
                maleCount++;
            } else if (Boolean.FALSE.equals(lecturer.getGender())) {
                femaleCount++;
            }
        }
        System.out.println("Male: " + maleCount);
        System.out.println("Female: " + femaleCount);
    }

    public void averageLecturerAgeByGender(Lecturer03[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;
        int maleAgeSum = 0;
        int femaleAgeSum = 0;
        for (Lecturer03 lecturer : lecturerArray) {
            if (Boolean.TRUE.equals(lecturer.getGender())) {
                maleAgeSum += lecturer.getAge();
                maleCount++;
            } else if (Boolean.FALSE.equals(lecturer.getGender())) {
                femaleAgeSum += lecturer.getAge();
                femaleCount++;
            }
        }
        System.out.println("Average Male Age: " + (maleCount == 0 ? 0 : (double) maleAgeSum / maleCount));
        System.out.println("Average Female Age: " + (femaleCount == 0 ? 0 : (double) femaleAgeSum / femaleCount));
    }

    public void showOldestLecturerInfo(Lecturer03[] lecturerArray) {
        Lecturer03 oldest = null;
        for (Lecturer03 lecturer : lecturerArray) {
            if (oldest == null || lecturer.getAge() > oldest.getAge()) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer: " + oldest);
    }

    public void showYoungestLecturerInfo(Lecturer03[] lecturerArray) {
        Lecturer03 youngest = null;
        for (Lecturer03 lecturer : lecturerArray) {
            if (youngest == null || lecturer.getAge() < youngest.getAge()) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer: " + youngest);
    }
}