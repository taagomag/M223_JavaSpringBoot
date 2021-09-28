package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
