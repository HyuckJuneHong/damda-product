package kr.co.damdaproduct.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    //find
    Optional<ProductEntity> findByProductCode (String productCode);

    //exists
    boolean existsByProductCode(String productCode);
}
