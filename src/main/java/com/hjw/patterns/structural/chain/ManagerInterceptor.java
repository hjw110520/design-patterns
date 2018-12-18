package com.hjw.patterns.structural.chain;

import java.util.List;

public class ManagerInterceptor implements Interceptor{
    @Override
    public List<DocApproval> intercept(Chain chain) {
        return chain.proceed(new DocApproval("Manager","pass"));
    }
}
