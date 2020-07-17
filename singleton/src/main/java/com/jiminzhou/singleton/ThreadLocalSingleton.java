package com.jiminzhou.singleton;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }
    private static final ThreadLocal<ThreadLocalSingleton> threadlocalSingleton
            = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance() {
        return threadlocalSingleton.get();
    }

}
