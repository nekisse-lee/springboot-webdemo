package com.nekisse.webservice.domain.posts;

import com.nekisse.webservice.domain.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    protected Posts() {
    }

    public static PostsBuilder builder() {
        return new PostsBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public static class PostsBuilder {
        private String title;
        private String content;
        private String author;

        PostsBuilder() {
        }

        public Posts.PostsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Posts.PostsBuilder content(String content) {
            this.content = content;
            return this;
        }

        public Posts.PostsBuilder author(String author) {
            this.author = author;
            return this;
        }

        public Posts build() {
            return new Posts(title, content, author);
        }

        public String toString() {
            return "Posts.PostsBuilder(title=" + this.title + ", content=" + this.content + ", author=" + this.author + ")";
        }
    }
}