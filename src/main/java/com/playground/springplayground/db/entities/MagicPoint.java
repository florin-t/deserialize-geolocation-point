package com.playground.springplayground.db.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.vividsolutions.jts.geom.*;


@Data
@Entity(name = "magic_points")
public class MagicPoint {
    @Id
    Integer id;

//    @Column(columnDefinition = "geography(POINT, 4326)", name = "p")
    @Column(name = "p", columnDefinition="Point")
    private Point point;

    @Column(name = "description")
    private String description;
}
