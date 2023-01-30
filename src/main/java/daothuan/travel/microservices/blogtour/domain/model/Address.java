package daothuan.travel.microservices.blogtour.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name ="ward")
    private String ward;

    @Column(name="district")
    private String district;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name ="zip_code")
    private String zipCode;

}
