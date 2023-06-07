package com.atl.jpa.jpatesting.repository;

import com.atl.jpa.jpatesting.entity.TutorialJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<TutorialJpa, Long> {

}
