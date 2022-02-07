package pedro.test.mapper;

import org.springframework.stereotype.Component;

import pedro.test.dto.IssueDTO;
import pedro.test.entity.IssueEntity;

@Component("IssueEntityMapper")
public class IssueEntityMapper implements IMapper<IssueDTO, IssueEntity> {


    @Override
    public IssueDTO classToEntity(IssueEntity model) {
        return IssueDTO.builder()
                .labelType(model.getLabel())
                .issue(model.getIssue())
                .description(model.getDescription())
                .build();
    }

    @Override
    public IssueEntity entityToClass(IssueDTO entity) {
        return IssueEntity.builder()
                .label(entity.getLabelType())
                .issue(entity.getIssue())
                .description(entity.getDescription())
                .build();
    }
}
