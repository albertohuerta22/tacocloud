package sia.tacocloud.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sia.tacocloud.Domain.Ingredient;

//BECAUSE USING CrudRepository, YOU DO NOT NEED TO EXPLICITLY IMPLEMENT INTERFACE, THEY ARE AUTO GENERATED AT RUN TIME BY SPRING DATA CLASS CAN BE DELETED!

@Repository
public class JdbcIngredientRepository {

//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public JdbcIngredientRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbcTemplate.query(
//                "select id, name, type from Ingredient",
//                this::mapRowToIngredient);
//    }
//    @Override
//    public Optional<Ingredient> findById(String id) {
//        List<Ingredient> results = jdbcTemplate.query(
//                "select id, name, type from Ingredient where id=?",
//                this::mapRowToIngredient,
//                id);
//        return results.size() == 0 ?
//                Optional.empty() :
//                Optional.of(results.get(0));
//    }
//    private Ingredient mapRowToIngredient(ResultSet row, int rowNum)
//            throws SQLException {
//        return new Ingredient(
//                row.getString("id"),
//                row.getString("name"),
//                Ingredient.Type.valueOf(row.getString("type")));
//    }
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        jdbcTemplate.update(
//                "insert into Ingredient (id, name, type) values (?, ?, ?)",
//                ingredient.getId(),
//                ingredient.getName(),
//                ingredient.getType().toString());
//        return ingredient;
//    }
}
