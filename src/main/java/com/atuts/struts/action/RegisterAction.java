package com.atuts.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;

/**
 * Login Action class
 *
 */
@Result(name = "success", location = "pages/register.jsp")
public class RegisterAction extends ActionSupport {
}
