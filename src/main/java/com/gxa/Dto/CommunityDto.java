package com.gxa.Dto;

public class CommunityDto {
    private Integer id;
    private String communityname;
    private String developername;
    private Integer propertyname;

    @Override
    public String toString() {
        return "CommunityDto{" +
                "id=" + id +
                ", communityname='" + communityname + '\'' +
                ", developername='" + developername + '\'' +
                ", propertyname=" + propertyname +
                '}';
    }

    public CommunityDto(Integer id, String communityname, String developername, Integer propertyname) {
        this.id = id;
        this.communityname = communityname;
        this.developername = developername;
        this.propertyname = propertyname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public String getDevelopername() {
        return developername;
    }

    public void setDevelopername(String developername) {
        this.developername = developername;
    }

    public Integer getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(Integer propertyname) {
        this.propertyname = propertyname;
    }
}
