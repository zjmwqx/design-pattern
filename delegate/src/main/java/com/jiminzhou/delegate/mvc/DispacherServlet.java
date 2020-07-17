package com.jiminzhou.delegate.mvc;

import com.jiminzhou.delegate.mvc.controllers.MemberController;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DispacherServlet {
    private List<Handler> handlerMapping = new ArrayList<Handler>();
    Class<?> memberControllerClass = MemberController.class;
    public void init() {
        // 当需要管理很多方法的时候，可以用注册单例来管理，把方法注册在一个容器中
        try{
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void doDispatch(HttpServletRequest request, HttpServletResponse response){
        String uri = request.getRequestURI();
        Handler handler = null;
        for(Handler handler1:handlerMapping) {
            if(uri.equals(handler1.getUrl())){
                handler = handler1;
            }
        }
        Object object = null;
        try {
            object = handler.method.invoke(handler.controller, request.getParameter("mid"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class Handler {
        private Object controller;
        private Method method;
        private String url;
        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
