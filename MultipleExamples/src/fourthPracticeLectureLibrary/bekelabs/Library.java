package fourthPracticeLectureLibrary.bekelabs;

import java.util.Date;

public class Library {
    private String title;
    private String author;
    private Date year;
    private int price;

    public Library() {
    }

    public Library(String title, String author, Date year, int price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int increasePriceByPercentage(int percentage) {
        return this.price*(percentage/100);
    }
    public String getData(){
        return "Title: "+ this.title + "\n" + "Author:" + this.author +"\n" + "Year of release: "+this.year +"\n" +
                "Price:" +this.price;
    }

}
