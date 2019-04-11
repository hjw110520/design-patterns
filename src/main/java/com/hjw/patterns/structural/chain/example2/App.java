package com.hjw.patterns.structural.chain.example2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Interceptor html = new HtmlInterceptor();
        UpperCaseInterceptor empty = new UpperCaseInterceptor();
        ArrayList<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(empty);
        interceptors.add(html);
        Request request = new Request();
        request.setReq("htmlstr aabbcc ddeeff hhttmmll");
        RealChain chain = new RealChain(interceptors,null,0);
        Response response = chain.proceed(request);
        System.out.println(response.getRes());
    }

}
