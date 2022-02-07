package pedro.test.service.interfaces;

import pedro.test.vo.IssueVO;

public interface IssueRestService {

    /**
     * The request Issue By Id
     * @param id
     * @return IssueVO
     */
    public IssueVO requestIssueById (long id);

    /**
     * The save Issue
     * @param issueVO
     * @return IssueVO
     */
    public void saveIssue(IssueVO issueVO);

}
