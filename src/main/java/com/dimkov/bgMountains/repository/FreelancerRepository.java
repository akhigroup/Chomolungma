package com.dimkov.bgMountains.repository;

import com.dimkov.bgMountains.domain.entities.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer,String> {
}
