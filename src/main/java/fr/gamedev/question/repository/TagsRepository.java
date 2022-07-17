package fr.gamedev.question.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Tags;

/**
 * Repository Tags
 * 
 * @author nicolas
 */
@RepositoryRestResource(collectionResourceRel = "tag", path = "tag")
public interface TagsRepository extends PagingAndSortingRepository<Tags, Long> {

}
