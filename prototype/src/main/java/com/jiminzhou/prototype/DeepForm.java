package com.jiminzhou.prototype;

import java.io.*;
import java.util.Date;

public class DeepForm implements Cloneable,Serializable{
    private String name;
    private Date createDate;
    private FormCofig formCofig;
    @Override
    protected Object clone(){
        Object o = null;
        try {
            o = this.deepClone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
    private DeepForm deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        DeepForm o = (DeepForm)ois.readObject();
        return o;
    }
}
