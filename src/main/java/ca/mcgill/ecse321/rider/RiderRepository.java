package ca.mcgill.ecse321.rider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    @Query("select r from Rider r where r.username = :username")
    Optional<Rider> findRiderByUsername(@Param("username") String username);
}