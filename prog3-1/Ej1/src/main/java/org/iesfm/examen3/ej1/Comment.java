package org.iesfm.examen3.ej1;

import java.util.Objects;

public class Comment {

    private String author;
    private String comment;

    public Comment(String author, String comment) {
        this.author = author;
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(author, comment1.author) && Objects.equals(comment, comment1.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, comment);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
