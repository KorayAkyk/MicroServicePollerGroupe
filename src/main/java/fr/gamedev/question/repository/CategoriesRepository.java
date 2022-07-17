package fr.gamedev.question.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Categories;

/**
 * 
 * @author nicolas
 *
 */
@RepositoryRestResource(collectionResourceRel = "categorie", path = "categorie")
public interface CategoriesRepository extends PagingAndSortingRepository<Categories, Long> {

}
