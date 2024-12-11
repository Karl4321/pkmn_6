package yakovlevma.pkmn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yakovlevma.pkmn.entities.StudentEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
    List<StudentEntity> findByGroup(String group);

    Optional<StudentEntity> findByFirstNameAndSurNameAndFamilyName(String firstName, String surName, String familyName);
}