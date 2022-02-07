package pedro.test.mapper;

import org.springframework.stereotype.Component;

import pedro.test.dto.IssueDTO;
import pedro.test.entity.IssueEntity;

@Component("IssueEntityMapper")
public class IssueEntityMapper implements IMapper<IssueDTO, IssueEntity> {


    @Override
    public IssueDTO classToEntity(IssueEntity model) {
        return null;
    }

    @Override
    public IssueEntity entityToClass(IssueDTO entity) {
        return new IssueEntity(null, entity.getIssue(), entity.getDescription(),  entity.getLabelType());
    }
}
