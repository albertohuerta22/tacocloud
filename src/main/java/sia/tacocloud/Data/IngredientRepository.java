package sia.tacocloud.Data;

import sia.tacocloud.Domain.Ingredient;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository <Ingredient, String> {
//    Iterable<Ingredient> findAll();
//
//    Optional<Ingredient> findById(String id);
//
//    Ingredient save(Ingredient ingredient);
}

//CrudRepository offers common methods, therefore no need to extend 'data.repository.Repository'