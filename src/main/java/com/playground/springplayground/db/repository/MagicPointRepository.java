package com.playground.springplayground.db.repository;

import com.playground.springplayground.db.entities.MagicPoint;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MagicPointRepository extends Repository<MagicPoint, Integer> {

    List<MagicPoint> getAllByDescription(String description);
}
