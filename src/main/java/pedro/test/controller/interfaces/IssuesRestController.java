package pedro.test.controller.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import pedro.test.vo.IssueVO;

/** Rest Controller for issues*/
public interface IssuesRestController {

    @GetMapping(value = "/get/{id}")
    public IssueVO getIssue(@PathVariable(value = "id") Long id);

    @GetMapping(value = {"/getAll", "getAll/{filters}"})
    public List<IssueVO> getIssues(
            @PathVariable(value = "filters", required = false) String filters);

    @PostMapping(value = "/create")
    public void create(@RequestBody IssueVO scenario);

    @PutMapping(value = "/update")
    public void update(@RequestBody IssueVO scenario);


    /**
     * Zuul controller
     */
    @FeignClient(value = "issues", contextId = "issues", path = "/issues")
    interface IssuesRestControllerZuul extends IssuesRestController { }
}
