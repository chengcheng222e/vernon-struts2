package com.vernon.struts2.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vernon.struts2.common.web.action.BaseAction;
import com.vernon.struts2.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: chenyuan
 * Date: 5/14/14
 * Time: 7:54
 * To change this template use File | Settings | File Templates.
 */
public class OGNLAction extends BaseAction {

    private Logger logger = LoggerFactory.getLogger(OGNLAction.class);

    private User user;


    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String edit() {
        if (user != null) {
            logger.info("userId = {}", user.getUserId());
            logger.info("userName = {}", user.getUserName());
            logger.info("age = {}", user.getAge());
            logger.info("address = {}", user.getAddress());
        }
        logger.info("User = {}", user);
        return SUCCESS;
    }

    // ----------------- setter / getter methods -----------------

    public void setUser(User user) {
        this.user = user;
    }
}
