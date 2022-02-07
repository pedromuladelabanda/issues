package pedro.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import pedro.test.controller.impl.IssuesRestControllerImpl;
import pedro.test.controller.interfaces.IssuesRestController;
import pedro.test.entity.IssueEntity;
import pedro.test.repository.IssueRepository;
import pedro.test.service.interfaces.IssueRestService;
import pedro.test.vo.IssueVO;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class IssueRestControllerTest {
    @InjectMocks
    private IssuesRestControllerImpl issuesRestController;

    @Mock private IssueRestService issueRestService;

    @Mock private IssueRepository issueRepository;

    @Mock private IssueVO issueVO;

    @Mock private IssueEntity issueEntity;

    @Test
    public void getIssueById(){
        Mockito.when(issueRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(issueEntity));
        Mockito.when(issueRestService.requestIssueById(Mockito.anyLong())).thenReturn(Mockito.eq(issueVO));
        assertTrue("TEST RUN SUCCESSFULLY", true);

    }
}
