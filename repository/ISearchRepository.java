package com.cognizant.smartshop.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.smartshop.model.Product;

@Repository
public interface ISearchRepository extends JpaRepository<Product, Long> {

	@Query(value="SELECT p.product_code, p.product_name, p.product_type, brand, "
			+ "p.rate_per_quantity, p.stock_count, p.add_date, p.aisle, p.shelf, "
			+ "p.date_of_manf, p.date_of_exp, p.product_img FROM product p "
			+ "WHERE p.product_name in (SELECT DISTINCT s.product_name FROM search s WHERE s.user_id=? ORDER BY s.id DESC)", nativeQuery=true)
	public List<Product> findAllSearch(String userId);

	@Query(value="SELECT p.product_name FROM product p", nativeQuery=true)
	public List<String> findAllProductNames();
	
	@Query(value="SELECT p.product_name FROM product p WHERE p.product_type=?", nativeQuery=true)
	public List<String> findAllProductNamesByCategory(String productType);
	
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO search(search_date,user_id,product_name) VALUES (CURDATE(),?,?)", nativeQuery=true)
	public void addSearch(String userId, String productName);

}
