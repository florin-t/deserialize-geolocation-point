package com.playground.springplayground.db.repository;

import com.playground.springplayground.db.entities.MagicPoint;
import org.springframework.data.repository.Repository;

public interface MagicPointRepository extends Repository<MagicPoint, Integer> {

    MagicPoint getAllByDescription(String description);
}
