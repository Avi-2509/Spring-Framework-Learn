package com.springcore.collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

public class Emp {
    private String empName;
    private String [] phoneNum;

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", phoneNum=" + Arrays.toString(phoneNum) +
                '}';
    }

    public Emp() {
        super();
    }

    public Emp(String empName, String[] phoneNum) {
        this.empName = empName;
        this.phoneNum = phoneNum;
    }

    public String getEmpName() {
        return empName;
    }

    public String[] getPhoneNum() {
        return phoneNum;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPhoneNum(String[] phoneNum) {
        this.phoneNum = phoneNum;
    }
}
