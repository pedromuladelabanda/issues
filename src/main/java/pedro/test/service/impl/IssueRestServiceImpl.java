package pedro.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

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
    IssueVO requestIssueById (long id){
        return null; // issueEntityMapper.classToEntity(issueRepository.findById(id));


    }
}
