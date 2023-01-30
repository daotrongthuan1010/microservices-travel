package daothuan.travel.microservices.blogtour.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedBy
    @Column(name = "created_by")
    private String createUser;

    @CreatedDate
    @Column(name = "creation_date")
    private LocalDateTime createDateTime;

    @LastModifiedBy
    @Column(name = "last_updated_by")
    private String updateUser;

    @LastModifiedDate
    @Column(name = "last_update_date")
    private LocalDateTime updateDateTime;

}
