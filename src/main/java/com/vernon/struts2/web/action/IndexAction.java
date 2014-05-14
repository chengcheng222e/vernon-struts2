package com.vernon.struts2.web.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyuan on 4/21/14.
 */
public class IndexAction extends ActionSupport {

    private Map<Integer, List<User>> mapLists;

    @Override
    public String execute() throws Exception {
        mapLists = new HashMap<Integer, List<User>>();
        List<User> list1 = new ArrayList<User>();
        User user1 = new User(1001, "陈袁1");
        User user2 = new User(1002, "王晓景1");
        list1.add(user1);
        list1.add(user2);
        mapLists.put(1, list1);
        List<User> list2 = new ArrayList<User>();
        User user3 = new User(1003, "陈袁2");
        User user4 = new User(1004, "王晓景2");
        list2.add(user3);
        list2.add(user4);
        mapLists.put(2, list2);
        return SUCCESS;
    }

    public Map<Integer, List<User>> getMapLists() {
        return mapLists;
    }

    public void setMapLists(Map<Integer, List<User>> mapLists) {
        this.mapLists = mapLists;
    }

    class User{

        private int userId;
        private String userName;

        User() {
        }

        User(int userId, String userName) {
            this.userId = userId;
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
