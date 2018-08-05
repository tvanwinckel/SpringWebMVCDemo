package com.axxes.helloWorld.intercept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor extends HandlerInterceptorAdapter {

    private final static Logger LOGGER = LoggerFactory.getLogger(Interceptor.class);

    /**
     * PreHandle will be be called before processing the logic inside the controller. A boolean value will be returned
     * indicating if it is ok to proceed or not.
     */

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        LOGGER.info("-- START PRE HANDLE -- ");
        LOGGER.info("Request url: " + request.getRequestURL().toString());
        LOGGER.info("-- STOP PRE HANDLE -- ");
        return true;
    }

    @Override
    public void postHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler, @Nullable final ModelAndView modelAndView) throws Exception {
        LOGGER.info("-- START POST HANDLE -- ");
        LOGGER.info("Message send: " + (modelAndView != null ? modelAndView.getModel().get("message") : "No Message"));
        LOGGER.info("View called: " + (modelAndView != null ? modelAndView.getViewName() : "No ViewName"));
        LOGGER.info("-- STOP POST HANDLE -- ");
    }

    @Override
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object handler, @Nullable final Exception ex) throws Exception {
        LOGGER.info("-- AFTER COMPLETION --");
    }
}
