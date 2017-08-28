package com.example.sxhs.sy_list;

/**
 * Created by sxhs on 2017/8/28.
 */

public class Xinxi {
    int imageId;
    String nameDiLocatiion;
    String xiangXiXinxi;

    public Xinxi(int imageId1, String nameDiLocatiion1, String xiangXiXinxi1) {
        this.imageId = imageId1;
        this.xiangXiXinxi = xiangXiXinxi1;
        this.nameDiLocatiion = nameDiLocatiion1;
    }

    public int getImageId() {
        return imageId;
    }

    public String getNameDiLocatiion() {
        return nameDiLocatiion;
    }

    public String getXiangXiXinxi() {
        return xiangXiXinxi;
    }
}
