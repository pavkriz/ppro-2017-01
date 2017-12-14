package cz.uhk.ppro.rest1.model;

public class Greeting {

    private final long id;
    private final String content;
    //private Student g = new Student();

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    //public Student getG() {
    //    return g;
    //}

    //public void setG(Student g) {
    //    this.g = g;
    //}
}
