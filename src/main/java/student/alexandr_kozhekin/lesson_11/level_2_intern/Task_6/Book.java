package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import java.util.Objects;

class Book {

    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {

        this.author = author;
        this.title = title;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public Long getId() {

        return this.id;

    }

    public String getTitle() {

        return this.title;

    }

    public String getAuthor() {

        return this.author;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void reName(Book [] book, String [] title) {

        book[0].setTitle("we");

    }
}
