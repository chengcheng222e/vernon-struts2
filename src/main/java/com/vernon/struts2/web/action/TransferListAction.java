package com.vernon.struts2.web.action;

import com.vernon.struts2.common.web.action.BaseAction;
import com.vernon.struts2.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chenyuan
 * Date: 6/25/14
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class TransferListAction extends BaseAction{

    private Logger logger = LoggerFactory.getLogger(OGNLAction.class);
    private List<User> userList;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


    public String param() throws Exception {
        if (userList != null) {
            for (User user : userList) {
                logger.info("user = {}", user);
            }
        }
        return SUCCESS;
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
