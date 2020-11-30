package com.newestnews.repository;

import com.newestnews.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {

    VerificationToken findByValue(String value);
}
