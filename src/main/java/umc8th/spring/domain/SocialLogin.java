package umc8th.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc8th.spring.domain.base.BaseEntity;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class SocialLogin extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SocialType type;

    public enum SocialType { GOOGLE, KAKAO, NAVER }
}