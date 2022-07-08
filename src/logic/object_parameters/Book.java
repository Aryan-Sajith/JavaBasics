package logic.object_parameters;

public class Book {
    private String title;
    private String author;
    private double cost;

    public Book(String title, String author, double cost) {
        this.title=title;
        this.author=author;
        this.cost=cost;
    }

    public String toString() {
        return title+" by "+author+" for $"+cost;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
}
