package pedro.test.repository;

import org.springframework.data.repository.CrudRepository;
import pedro.test.entity.IssueEntity;

public interface IssueRepository extends CrudRepository<IssueEntity, Long> {}

