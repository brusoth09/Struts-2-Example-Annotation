package com.atuts.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/User")
@ResultPath(value = "/")
public class WelcomeUserAction {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Action(value = "Welcome", results = {
            @Result(name = "success", location = "pages/welcome_user.jsp")
    })
    public String execute(){
        return "SUCCESS";
    }
}
