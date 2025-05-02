package umc8th.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc8th.spring.repository.MissionRepository;
import umc8th.spring.repository.SelectFoodTypeRepository;
import umc8th.spring.repository.UserRepository;

@Service
@Transactional
public class UserService {
    
    UserRepository userRepository;
    SelectFoodTypeRepository selectFoodTypeRepository;
    MissionRepository missionRepository;
    
    public void deleteMember(Long userId) {
        // 관련 데이터 먼저 배치 삭제
        selectFoodTypeRepository.deleteByUserId(userId);
        missionRepository.deleteByUserId(userId);
        
        // 마지막으로 member 삭제
        userRepository.deleteById(userId);
    }
}
