package com.jiminzhou.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Form implements Cloneable{
    private String name;
    private Date createDate;
    private FormCofig formCofig;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
