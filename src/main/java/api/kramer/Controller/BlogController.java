package api.kramer.Controller;

import api.kramer.Model.Comment;
import api.kramer.Model.Post;
import api.kramer.Repository.CommentRepo;
import api.kramer.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    CommentRepo commentRepo;

    // Der bruges Getmapping for at indikere
    @CrossOrigin
    @GetMapping("/posts")
    public @ResponseBody Iterable<Post> getAllPosts(){

        return postRepo.findAll();
    }

    @GetMapping("/posts/{id}")
    @CrossOrigin()
    public @ResponseBody Optional<Post> getPost(@PathVariable("id") String id){
        return postRepo.findById(Long.valueOf(id));
    }

    @PostMapping("/posts")
    @CrossOrigin()
    public @ResponseBody String addPost(@ModelAttribute Post post){
        postRepo.save(post);
        return "Resource added";
    }

    @PutMapping("/posts")
    @CrossOrigin()
    public @ResponseBody String updatePost(@ModelAttribute Post post){
        postRepo.save(post);
        return "Resource updated or added";
    }

    @DeleteMapping("/posts/{id}")
    @CrossOrigin()
    public @ResponseBody String deletePost(@PathVariable("id") String id){
        postRepo.deleteById(Long.valueOf(id));
        return "Resource deleted";
    }

    /* COMMENTS */

    @GetMapping("/comments")
    @CrossOrigin()
    public @ResponseBody Iterable<Comment> getAllComments(){

        return commentRepo.findAll();
    }

    @GetMapping("/comments/{id}")
    @CrossOrigin()
    public @ResponseBody Optional<Comment> getComment(@PathVariable("id") String id){
        return commentRepo.findById(Long.valueOf(id));
    }

    @PostMapping("/comments")
    @CrossOrigin()
    public @ResponseBody String addComment(@ModelAttribute Comment comment){
        commentRepo.save(comment);
        return "Resource added";
    }

    @PutMapping("/comments")
    @CrossOrigin()
    public @ResponseBody String updateComment(@ModelAttribute Comment comment){
        commentRepo.save(comment);
        return "Resource updated or added";
    }

    @DeleteMapping("/comments/{id}")
    @CrossOrigin()
    public @ResponseBody String deleteComment(@PathVariable("id") String id){
        commentRepo.deleteById(Long.valueOf(id));
        return "Resource deleted";
    }

}
