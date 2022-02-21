package pl.mojaapka.restapi.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.mojaapka.restapi.model.Post;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Repository
@EnableSwagger2
public interface PostRepository extends JpaRepository<Post, Long> {


    @Query("Select p From Post p")
    List<Post> findAllPosts(Pageable page);
}
