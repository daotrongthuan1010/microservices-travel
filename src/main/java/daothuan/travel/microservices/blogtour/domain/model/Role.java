package daothuan.travel.microservices.blogtour.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Role extends AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name_role")
    private String nameRole;

    @OneToMany(mappedBy = "role", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<User_Role> userRoles = new HashSet<>();
}
