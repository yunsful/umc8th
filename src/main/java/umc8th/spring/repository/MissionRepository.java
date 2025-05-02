package umc8th.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import umc8th.spring.domain.Mission;
import umc8th.spring.domain.User;

public interface MissionRepository extends JpaRepository<Mission, Long> {
    
    @Modifying
    @Query("delete from Mission m where m.user.id = :userId")
    void deleteByUserId(@Param("userId") Long userId);
}
