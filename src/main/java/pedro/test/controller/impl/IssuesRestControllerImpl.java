package pedro.test.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import pedro.test.common.types.LabelType;
import pedro.test.controller.interfaces.IssuesRestController;
import pedro.test.vo.IssueVO;

@RestController
@RequestMapping("/issues")
public class IssuesRestControllerImpl implements IssuesRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IssuesRestControllerImpl.class);
    @Autowired
    private static LabelType labelType;

    /**@Autowired
    private IssueRestServiceImpl gitRestService;
*/
    @Override
    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand
    public @ResponseBody
    IssueVO getIssue(Long id){
        LOGGER.info("REST CONTROLLER {} INVOCATION", this.getClass().getName());
        return null;
    }


    @Override
    @HystrixCommand
    @GetMapping(value = {"/getAll", "getAll/{filters}"})
    public @ResponseBody
    List<IssueVO> getIssues(@PathVariable("filters") String filters) {
        LOGGER.info("REST CONTROLLER {} INVOCATION", this.getClass().getName());
        return null;
        //return this.gitRestService.get();
    }

    @Override
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand
    public IssueVO create(IssueVO issueVO) {
        LOGGER.info("REST CONTROLLER {} INVOCATION", issueVO.getIssue() + issueVO.getLabelType());
        return null;
    }

    @Override
    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand
    public IssueVO update(IssueVO issueVO) {
        LOGGER.info("REST CONTROLLER {} INVOCATION", this.getClass().getName());
        return null;
    }

}
