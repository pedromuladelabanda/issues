package pedro.test.mapper;

import org.springframework.stereotype.Component;

import pedro.test.dto.IssueDTO;
import pedro.test.entity.IssueEntity;

@Component("IssueEntityMapper")
public class IssueEntityMapper implements IMapper<IssueDTO, IssueEntity> {
    @Override
    public IssueEntity classToEntity(IssueDTO model) {
        return new IssueEntity(model.getIssue(), model.getLabelType(), model.getDescription());
    }

    @Override
    public IssueDTO entityToClass(IssueEntity entity) {
        return new IssueDTO(entity.getIssue(), entity.getLabel(), entity.getDescription());
    }
}
