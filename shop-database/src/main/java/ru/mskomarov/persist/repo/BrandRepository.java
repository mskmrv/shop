package ru.mskomarov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.mskomarov.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    @Query("from Brand b where name = :name")
    Brand findOneByName(String name);
}
