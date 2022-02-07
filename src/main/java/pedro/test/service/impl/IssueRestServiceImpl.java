package pedro.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import pedro.test.dto.IssueDTO;
import pedro.test.entity.IssueEntity;
import pedro.test.mapper.IssueEntityMapper;
import pedro.test.mapper.IssueMapper;
import pedro.test.repository.IssueRepository;
import pedro.test.service.interfaces.IssueRestService;
import pedro.test.vo.IssueVO;

public class IssueRestServiceImpl implements IssueRestService {

    @Autowired
    private static IssueRepository issueRepository;

    @Autowired
    private static IssueMapper issueMapper;

    @Autowired
    private static IssueEntityMapper issueEntityMapper;


    public IssueVO requestIssueById (long id){
        Optional<IssueEntity> issueEntity = issueRepository.findById(id);
        if(issueEntity.isPresent()) {
            IssueDTO issueDTO = issueEntityMapper.classToEntity(issueEntity.get());
            return issueMapper.classToEntity(issueDTO);
        } else {
            return null;
        }

    }

    public void saveIssue(IssueVO issueVO){
        issueRepository.save(issueEntityMapper.entityToClass(issueMapper.entityToClass(issueVO)));
    }

}
