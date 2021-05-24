package org.iesfm.examen3.ej1;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Canal {
    private String name;
    private String author;
    private TreeSet<Video> videos;
    private HashSet<String> users;

    public Canal(String name, String author, TreeSet<Video> videos, HashSet<String> users) {
        this.name = name;
        this.author = author;
        this.videos = videos;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TreeSet<Video> getVideos() {
        return videos;
    }

    public void setVideos(TreeSet<Video> videos) {
        this.videos = videos;
    }

    public HashSet<String> getUsers() {
        return users;
    }

    public void setUsers(HashSet<String> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canal canal = (Canal) o;
        return Objects.equals(name, canal.name) && Objects.equals(author, canal.author) && Objects.equals(videos, canal.videos) && Objects.equals(users, canal.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, videos, users);
    }

    @Override
    public String toString() {
        return "Canal{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", videos=" + videos +
                ", users=" + users +
                '}';
    }
}
