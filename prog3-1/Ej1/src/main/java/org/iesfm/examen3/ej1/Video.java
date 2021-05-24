package org.iesfm.examen3.ej1;

import java.util.List;
import java.util.Objects;

public class Video implements Comparable<Video> {
    private String title;
    private String date;
    private List<Comment> comments;

    public Video(String title, String date, List<Comment> comments) {
        this.title = title;
        this.date = date;
        this.comments = comments;
    }

    @Override
    public int compareTo(Video video) {
        return this.date.compareTo(video.getDate());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(title, video.title) && Objects.equals(date, video.date) && Objects.equals(comments, video.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, comments);
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", comments=" + comments +
                '}';
    }
}
