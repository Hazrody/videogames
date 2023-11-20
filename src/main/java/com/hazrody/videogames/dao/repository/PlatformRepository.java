package com.hazrody.videogames.dao.repository;

import com.hazrody.videogames.dao.entity.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
}
