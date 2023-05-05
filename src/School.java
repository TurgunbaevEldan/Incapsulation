public class School {
    private int floor;
    private String student;
    private String lessons;

    public School(int floor, String student, String lessons) {
        this.floor = floor;
        this.student = student;
        this.lessons = lessons;
    }
    public School(){

    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "< School >" +'\n'+
                " Floor: " + floor +'\n'+
                " Student: " + student +'\n'+
                " Lessons: " + lessons+'\n' ;
    }
}
