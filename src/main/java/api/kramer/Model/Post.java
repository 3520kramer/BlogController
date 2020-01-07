package api.kramer.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    // Laver et sæt da jeg gerne vil kunne have flere kommentarer til en post
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Set<Comment> comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Comment> getComment() {
        return comment;
    }

    public void setComment(Set<Comment> comment) {
        this.comment = comment;
    }
}
