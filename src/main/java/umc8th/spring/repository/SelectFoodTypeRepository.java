package umc8th.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import umc8th.spring.domain.SelectFoodType;

public interface SelectFoodTypeRepository extends JpaRepository<SelectFoodType, Long> {
    
    @Modifying
    @Query("delete from SelectFoodType sft where sft.user.id = :userId")
    void deleteByUserId(@Param("userId") Long userId);
    
}
