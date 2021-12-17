package ru.mskomarov.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mskomarov.persist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
