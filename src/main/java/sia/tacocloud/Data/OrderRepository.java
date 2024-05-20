package sia.tacocloud.Data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Domain.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

//    TacoOrder save(TacoOrder order);

}
