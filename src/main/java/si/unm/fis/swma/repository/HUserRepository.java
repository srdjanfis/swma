package si.unm.fis.swma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import si.unm.fis.swma.model.HUser;

public interface HUserRepository extends JpaRepository<HUser, Long> {
    HUser findByUsername(String username);
}
