package repository;

import model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepositoryInterface {
    List<Post> all();

    Optional<Post> getById(long id);

    Post save(Post post);

    void removeById(long id);
}