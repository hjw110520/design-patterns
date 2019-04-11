package com.hjw.patterns.structural.chain.example1;

import java.util.List;

public class XiaoMingInterceptor implements Interceptor{
    @Override
    public List<DocApproval> intercept(Chain chain) {
        return chain.proceed(new DocApproval("XiaoMing","pass"));
    }
}
