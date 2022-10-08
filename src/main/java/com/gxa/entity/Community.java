package com.gxa.entity;

import lombok.Data;

@Data
public class Community {
    private Integer id;
    private String communityname;
    private String address;
    private String area;
    private Integer totalnumber;
    private Integer totalhouseholds;
    private String greeningrate;
    private String thumbnail;
    private String developername;
    private String propertyname;
    private String state;

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", communityname='" + communityname + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", totalnumber=" + totalnumber +
                ", totalhouseholds=" + totalhouseholds +
                ", greeningrate='" + greeningrate + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", developername='" + developername + '\'' +
                ", propertyname='" + propertyname + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Community(int id, String communityname, String address, String area, int totalnumber, int totalhouseholds, String greeningrate, String thumbnail, String developername, String propertyname, String state) {
        this.id = id;
        this.communityname = communityname;
        this.address = address;
        this.area = area;
        this.totalnumber = totalnumber;
        this.totalhouseholds = totalhouseholds;
        this.greeningrate = greeningrate;
        this.thumbnail = thumbnail;
        this.developername = developername;
        this.propertyname = propertyname;
        this.state = state;
    }
}
