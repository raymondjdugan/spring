package raymond.spring_exercises.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raymond.spring_exercises.data.Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/posts", headers = "Accept=application/json")
public class PostController {

    public List<Post> createList (){
        Post post1 = new Post((long) 1, "Hi", "Hello One");
        Post post2 = new Post((long)2, "Hiya", "Hello Two");
        Post post3 = new Post((long)3, "Hiya Hi", "Hello Three");
        return new ArrayList<>(Arrays.asList(post1, post2, post3));
    }

    @GetMapping
    private List<Post> getAll() {
        return createList();
    }

    @GetMapping("{id}")
    private Post getOne(@PathVariable Long id) {
        List<Post> blogs = createList();
        for (Post blog: blogs) {
            if (blog.getId().longValue() == id) {
                return blog;
            }
        }
        return null;
    }
}
