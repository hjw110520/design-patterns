package com.hjw.patterns.structural.chain;

import java.util.List;

public interface Interceptor {
    List<DocApproval> intercept(Chain chain);

    public interface Chain{
        List<DocApproval> getDocApprovalList();
        public List<DocApproval> proceed(DocApproval docApproval);
    }
}
