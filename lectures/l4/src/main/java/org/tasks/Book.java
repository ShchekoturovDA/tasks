public class Book {
    Author author;
    int Year;

    public void Book(Author author, int Year){
        this.author = author;
        this.Year = Year;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return Year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String toString(){
        String sb = "Автор книги: " + author + " Написана книга в " + Year + " году";
        return sb;
    }

}
