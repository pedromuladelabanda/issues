package pedro.test.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import pedro.test.vo.IssuesVO;

/** Rest Controller for issues*/
public interface IssuesRestController {
    @GetMapping(value = "/get/{params}")
    List<IssuesVO> requestIssues(String params);

    /**
     * Zuul controller
     */
    @FeignClient(value = "issues", contextId = "issues", path = "/issues")
    interface IssuesRestControllerZuul extends IssuesRestController { }
}
