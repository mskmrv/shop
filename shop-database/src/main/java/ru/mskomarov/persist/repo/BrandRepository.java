package ru.mskomarov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mskomarov.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
