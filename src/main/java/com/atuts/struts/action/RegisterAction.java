package com.atuts.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 * Login Action class
 *
 */
@Namespace("/User")
@ResultPath(value = "/")
@Result(name = "success", location = "pages/register.jsp")
public class RegisterAction extends ActionSupport {
}
