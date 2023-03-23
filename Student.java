public class Student { // Parent class

    private int idNum;
    private double gpa;

    public void setIdNum(int idNum) { // Set is inserting the information to the private data
        this.idNum = idNum;
    }

    public int getIdNum() { // Get is requesting the information to see in println or etc
        return idNum;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

}