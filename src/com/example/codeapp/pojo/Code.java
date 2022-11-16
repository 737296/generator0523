package com.example.codeapp.pojo;

public class Code {
    private Integer id;

    private Integer codeduserid;

    private String codename;

    private String codetext;

    private String codeversion;

    private Integer codetypeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeduserid() {
        return codeduserid;
    }

    public void setCodeduserid(Integer codeduserid) {
        this.codeduserid = codeduserid;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename == null ? null : codename.trim();
    }

    public String getCodetext() {
        return codetext;
    }

    public void setCodetext(String codetext) {
        this.codetext = codetext == null ? null : codetext.trim();
    }

    public String getCodeversion() {
        return codeversion;
    }

    public void setCodeversion(String codeversion) {
        this.codeversion = codeversion == null ? null : codeversion.trim();
    }

    public Integer getCodetypeid() {
        return codetypeid;
    }

    public void setCodetypeid(Integer codetypeid) {
        this.codetypeid = codetypeid;
    }
}