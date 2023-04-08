package data;

public class Student extends User {
    private float avgMark;
    private int group;

    public Student(int id, String name, float avgMark, int group) {
        super(id, name);
        this.avgMark = avgMark;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() +"[avgMark=" + avgMark + ", group=" + group + "]";
    }

      

}
