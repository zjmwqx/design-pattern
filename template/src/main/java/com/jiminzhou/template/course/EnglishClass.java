package com.jiminzhou.template.course;

public class EnglishClass extends NetworkVideoCourse{
    @Override
    protected void postSource() {
        System.out.println("英语课准备资料");
    }
}
