package raymond.spring_exercises.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/posts", headers = "Accept=application/json")
public class PostController {

}
