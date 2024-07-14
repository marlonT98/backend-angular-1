package com.marlon.springboot.backend.backend_product.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.marlon.springboot.backend.backend_product.entities.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository  extends CrudRepository< Product , Long >{

}
