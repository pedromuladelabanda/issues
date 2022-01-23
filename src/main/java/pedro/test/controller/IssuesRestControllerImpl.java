package pedro.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import pedro.test.interfaces.IssuesRestController;
import pedro.test.vo.IssuesVO;

@RestController
@RequestMapping("/issues")
public class IssuesRestControllerImpl implements IssuesRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IssuesRestControllerImpl.class);


    @Override
    @HystrixCommand
    @GetMapping(value="/get/{params}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<IssuesVO> requestIssues(@PathVariable("params") String params) {
        LOGGER.info("REST CONTROLLER {} INVOCATION", this.getClass().getName());
        return null;
    }
}
