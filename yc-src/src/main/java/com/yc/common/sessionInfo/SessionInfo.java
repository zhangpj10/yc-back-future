package com.yc.common.sessionInfo;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @创建人 zhangpj
 * @创建时间 2017/11/29
 * @描述
 **/
public class SessionInfo {

    public final static String SESSION_STAFF_NAME = "staffInfo";

    /**
     * 设置当前用户对象至 session
     */
    public static void setStaff(Staff staff) {
        getRequest().getSession().setAttribute(SESSION_STAFF_NAME, staff);
    }

    /**
     * 获取当前用户对象
     */
    public static Staff getStaff(HttpSession session) {
        return (Staff) session.getAttribute(SESSION_STAFF_NAME);
    }

    public static Staff getStaff(HttpServletRequest request) {
        return getStaff(request.getSession());
    }

    /**
     * 获取当前用户 id
     */
    public static Long getStaffId(HttpSession session) {
        return getStaff(session).getStaffId();
    }

    public static Long getStaffId(HttpServletRequest request) {
        return getStaffId(request.getSession());
    }

    /**
     * 获取当前用户 id
     */
    public static Long getStaffId() {
        return getStaff().getStaffId();
    }

    /**
     * 获取当前用户对象
     */
    public static Staff getStaff() {
        return (Staff) getRequest().getSession().getAttribute(SESSION_STAFF_NAME);
    }

    private static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
