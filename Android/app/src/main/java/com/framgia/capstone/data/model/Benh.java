package com.framgia.capstone.data.model;

import java.io.Serializable;

/**
 * Created by Age on 4/9/2017.
 */

public class Benh implements Serializable {
    private String mMaBenh;
    private String mTenBenh;
    private String mHinhAnh;
    private String mTrieuChung;
    private String mCachDieuTri;

    public Benh(String maBenh, String tenBenh, String hinhAnh, String trieuChung, String cachDieuTri) {
        mMaBenh = maBenh;
        mTenBenh = tenBenh;
        mHinhAnh = hinhAnh;
        mTrieuChung = trieuChung;
        mCachDieuTri = cachDieuTri;
    }

    public String getMaBenh() {
        return mMaBenh;
    }

    public void setMaBenh(String maBenh) {
        mMaBenh = maBenh;
    }

    public String getTenBenh() {
        return mTenBenh;
    }

    public void setTenBenh(String tenBenh) {
        mTenBenh = tenBenh;
    }

    public String getHinhAnh() {
        return mHinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        mHinhAnh = hinhAnh;
    }

    public String getTrieuChung() {
        return mTrieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        mTrieuChung = trieuChung;
    }

    public String getCachDieuTri() {
        return mCachDieuTri;
    }

    public void setCachDieuTri(String cachDieuTri) {
        mCachDieuTri = cachDieuTri;
    }
}
