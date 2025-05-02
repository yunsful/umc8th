package umc8th.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc8th.spring.domain.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class User extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String password;
    
    private String name;
    
    private String nickname;
    
    private String gender;
    
    private String birthday;
    
    private String address;
    
    private String phoneNumber;
    
    private String email;
    
    private Integer points;
    
    private String status;
    
    private LocalDateTime inactivatedAt;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "social_login_id")
    private SocialLogin socialLogin;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> reviews = new HashSet<>();
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Mission> missions = new HashSet<>();
}
