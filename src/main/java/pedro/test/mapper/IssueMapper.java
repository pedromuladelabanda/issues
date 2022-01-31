package pedro.test.mapper;

import org.springframework.stereotype.Component;

import pedro.test.dto.IssueDTO;
import pedro.test.vo.IssueVO;

@Component("IssueMapper")
public class IssueMapper implements IMapper<IssueVO, IssueDTO> {
    @Override
    public IssueVO classToEntity(IssueDTO model) {
        return null;
    }

    @Override
    public IssueDTO entityToClass(IssueVO entity) {
        return null;
    }
}
