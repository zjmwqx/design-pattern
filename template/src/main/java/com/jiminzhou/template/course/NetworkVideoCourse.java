package com.jiminzhou.template.course;

public abstract class NetworkVideoCourse {
    public final void createClass() {
        if(needHomework())
            postSource();
    }

    protected boolean needHomework(){return true;}

    protected abstract void postSource();
}
