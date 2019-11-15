package com.jk.model.cjl;

import java.io.Serializable;
import java.util.Date;

public class YongHu implements Serializable {
    private static final long serialVersionUID = -8403621316900910469L;
    private Integer userid;

    private String username;

    private String userword;

    private String userphone;

    private String useremail;

    private String userimg;

    private String xname;

    private String xidentity;

    private String sjsex;

    private Date sjdate;

    private String sjaddress;

    private String sjjy;

    private String sjwork;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserword() {
        return userword;
    }

    public void setUserword(String userword) {
        this.userword = userword == null ? null : userword.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname == null ? null : xname.trim();
    }

    public String getXidentity() {
        return xidentity;
    }

    public void setXidentity(String xidentity) {
        this.xidentity = xidentity == null ? null : xidentity.trim();
    }

    public String getSjsex() {
        return sjsex;
    }

    public void setSjsex(String sjsex) {
        this.sjsex = sjsex == null ? null : sjsex.trim();
    }

    public Date getSjdate() {
        return sjdate;
    }

    public void setSjdate(Date sjdate) {
        this.sjdate = sjdate;
    }

    public String getSjaddress() {
        return sjaddress;
    }

    public void setSjaddress(String sjaddress) {
        this.sjaddress = sjaddress == null ? null : sjaddress.trim();
    }

    public String getSjjy() {
        return sjjy;
    }

    public void setSjjy(String sjjy) {
        this.sjjy = sjjy == null ? null : sjjy.trim();
    }

    public String getSjwork() {
        return sjwork;
    }

    public void setSjwork(String sjwork) {
        this.sjwork = sjwork == null ? null : sjwork.trim();
    }
}