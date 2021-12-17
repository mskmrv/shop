package ru.mskomarov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.mskomarov.persist.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("from Category c where nane = :name")
    Category findByName(String name);
}
