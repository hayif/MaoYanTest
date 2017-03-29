package org.movie.entity;

/**
 * Created by guowei on 2017/2/26.
 * photos_info 图集信息表
 */
public class MoviePhotos {
    //图集id
    private String photosId;
    //图集地址
    private String photosAddress;

    public String getPhotosId() {
        return photosId;
    }

    public void setPhotosId(String photosId) {
        this.photosId = photosId;
    }

    public String getPhotosAddress() {
        return photosAddress;
    }

    public void setPhotosAddress(String photosAddress) {
        this.photosAddress = photosAddress;
    }
}
