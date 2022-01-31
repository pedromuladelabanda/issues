package pedro.test.mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The Interface IMapper.
 *
 * @param <X> the generic type
 * @param <T> the generic type
 */
public interface IMapper<X, T> {

    /**
     * Class to entity.
     *
     * @param model the model
     * @return the x
     */
    X classToEntity(T model);

    /**
     * Entity to class.
     *
     * @param entity the entity
     * @return the t
     */
    T entityToClass(X entity);

    /**
     * Class list to entity.
     *
     * @param models the models
     * @return the list
     */
    default List<X> classListToEntity(List<T> models) {
        return models.stream().map(this::classToEntity).collect(Collectors.toList());
    }

    /**
     * Entity list to class.
     *
     * @param entities the entities
     * @return the list
     */
    default List<T> entityListToClass(List<X> entities) {
        return entities.stream().map(this::entityToClass).collect(Collectors.toList());
    }
}
