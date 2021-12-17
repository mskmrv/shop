package ru.mskomarov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mskomarov.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
