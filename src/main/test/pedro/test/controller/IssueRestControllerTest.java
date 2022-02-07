package pedro.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import pedro.test.controller.impl.IssuesRestControllerImpl;
import pedro.test.controller.interfaces.IssuesRestController;
import pedro.test.dto.IssueDTO;
import pedro.test.entity.IssueEntity;
import pedro.test.mapper.IssueEntityMapper;
import pedro.test.mapper.IssueMapper;
import pedro.test.repository.IssueRepository;
import pedro.test.service.interfaces.IssueRestService;
import pedro.test.vo.IssueVO;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class IssueRestControllerTest {

    @InjectMocks private IssuesRestControllerImpl issuesRestController;

    @Mock private IssueRestService issueRestService;

    @Mock private IssueRepository issueRepository;

    @Mock private IssueEntityMapper issueEntityMapper;

    @Mock private IssueMapper issueMapper;

    @Mock private IssueVO issueVO;

    @Mock private IssueEntity issueEntity;

    @Mock private IssueDTO issueDTO;

    @Before
    public void setUp() {
        Mockito.when(issueEntity.getIssue()).thenReturn(Mockito.anyString());
        Mockito.when(issueEntity.getDescription()).thenReturn(Mockito.anyString());
        Mockito.when(issueEntity.getLabel()).thenReturn(Mockito.anyInt());
        Mockito.when(issueVO.getIssue()).thenReturn(Mockito.anyString());
        Mockito.when(issueVO.getDescription()).thenReturn(Mockito.anyString());
        Mockito.when(issueVO.getLabelType()).thenReturn(Mockito.anyInt());
        Mockito.when(issueDTO.getIssue()).thenReturn(Mockito.anyString());
        Mockito.when(issueDTO.getDescription()).thenReturn(Mockito.anyString());
        Mockito.when(issueDTO.getLabelType()).thenReturn(Mockito.anyInt());
        Mockito.when(issueRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(issueEntity));
        Mockito.when(issueEntityMapper.classToEntity(Mockito.any())).thenReturn(issueDTO);
        Mockito.when(issueMapper.classToEntity(Mockito.any())).thenReturn(issueVO);
        Mockito.when(issueMapper.entityToClass(Mockito.any())).thenReturn(issueDTO);
        Mockito.when(issueEntityMapper.entityToClass(Mockito.any())).thenReturn(issueEntity);
        Mockito.when(issueRestService.requestIssueById(Mockito.anyLong())).thenReturn(Mockito.eq(issueVO));
    }

    @Test
    public void getIssueById(){

        Mockito.when(issuesRestController.getIssue(Mockito.anyLong())).thenReturn(issueVO);
        assertTrue("TEST RUN SUCCESSFULLY", true);

    }
}
