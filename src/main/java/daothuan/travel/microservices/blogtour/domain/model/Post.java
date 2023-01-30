package daothuan.travel.microservices.blogtour.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post extends AuditLog  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title_post")
    private String titlePost;

    @Column(name="content_post")
    private String contentPost;

    @Column(name = "post_time")
    private String timePost;

}
