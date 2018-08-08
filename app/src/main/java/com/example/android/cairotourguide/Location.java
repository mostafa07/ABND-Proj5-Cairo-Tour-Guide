package com.example.android.cairotourguide;


public class Location {

    /**
     * Member variables
     */
    private String mName;
    private String mAddress;
    private String mOpeningHours;
    private String mPhone = null;
    private String mWikiUrl = null;
    private static final int NOT_PROVIDED = -1;
    private int mImgResId = NOT_PROVIDED;

    /**
     * Constructors
     */
    public Location(String mName, String mAddress, String mOpeningHours, String mPhone, String mWikiUrl, int mImgResId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mOpeningHours = mOpeningHours;
        this.mPhone = mPhone;
        this.mWikiUrl = mWikiUrl;
        this.mImgResId = mImgResId;
    }

    public Location(String mName, String mAddress, String mOpeningHours, String mPhone, String mWikiUrl) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mOpeningHours = mOpeningHours;
        this.mPhone = mPhone;
        this.mWikiUrl = mWikiUrl;
    }

    public Location(String mName, String mAddress) {
        this.mName = mName;
        this.mAddress = mAddress;
    }

    public Location(String mName, String mAddress, int mImgResId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImgResId = mImgResId;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getOpeningHours() {
        return mOpeningHours;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWikiUrl() {
        return mWikiUrl;
    }

    public int getImgResId() {
        return mImgResId;
    }

    /**
     * Other methods
     */
    public boolean hasImage() {
        return mImgResId != NOT_PROVIDED;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mOpeningHours='" + mOpeningHours + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mWikiUrl='" + mWikiUrl + '\'' +
                ", mImgResId=" + mImgResId +
                '}';
    }
}
