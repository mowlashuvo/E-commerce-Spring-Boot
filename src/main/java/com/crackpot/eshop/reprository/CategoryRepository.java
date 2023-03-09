package com.crackpot.eshop.reprository;

import com.crackpot.eshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
