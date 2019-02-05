# Prerequisites
- have a mysql db
- create the following table and insert the data below
- enter your credentials in application.properties

# Create the table in db

CREATE TABLE magic_points(id INT NOT NULL AUTO_INCREMENT, p POINT NOT NULL SRID 4326, description VARCHAR(50), SPATIAL INDEX(p), PRIMARY KEY (id));

# Some test data

INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(1.0 1.0)', 4326), "Abc");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(3.0 3.0)', 4326), "Rrr");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(2.0 2.0)', 4326), "ooo");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(2.0 4.0)', 4326), "kll");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(5.0 5.0)', 4326), "zzz");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(4.0 2.0)', 4326), "XYZ");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(3.5 3.0)', 4326), "BWW");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(4.0 1.0)', 4326), "CCC");
INSERT INTO magic_points VALUES (NULL, ST_GeomFromText('POINT(3.0 4.0)', 4326), "III");


# Run the project
- from IDE
- command line: ./gradlew bootRun