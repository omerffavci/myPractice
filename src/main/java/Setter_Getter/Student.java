package Setter_Getter;

public class Student {
    private String stId = "12902016";
    private boolean result = false;
    private double note = 2.3;

    public String getStId() {
        return stId;
    }

    public boolean isResult() {
        return result;
    }

    public double getNote() {
        return note;
    }


    public void setStId(String stId) {
        this.stId = stId;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
