package dev.local.springboot_test_bench.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(
        name = "BENCH_USERS",
        uniqueConstraints = @UniqueConstraint(name = "UQ_USERNAME", columnNames = "USERNAME")
)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(example = "1")
    @Column(name = "USER_ID")
    private int id;

    @NotBlank
    @Size(max=50)
    @Schema(example="miCat008")
    private String username;

    @NotBlank
    @Size(min = 6, max = 200)
    @Schema(example = "123456", format = "password")
    private String password;

    @NotBlank
    @Size(max=50)
    @Schema(example = "Michael Cater")
    @Column(name="FULL_NAME")
    private String fullName;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"))
    private List<Role> role;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", updatable = false)
    @Schema(example = "2024-01-01T00:00:00.000Z")
    private OffsetDateTime createdDate;
}