package com.baidu.location.model;

import com.baidu.location.BDLocation;
import com.baidu.location.Poi;

/**
 * 作者：author
 * 时间：2018/4/7:16:42
 */
public class PositionInformation {
    private String locationType;
    private String locationTypeDescribe;
    private String dimension;//经度
    private String longitude;//纬度
    private String radius;//半径
    private String countryCode;
    private String countryName;
    private String cityCode;
    private String cityName;
    private String district;//区
    private String street;//街道
    private String addressInfo;
    private String userIndoorState;
    private String direction;
    private String locationDescrible;
    private String locationDetail;
    private String speed;
    private String satelliteNumber;
    private String altitude;
    private String gpsAccuracyStatus;
    private String locateDescrible;
    private String operators;//运营商信息

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getLocationTypeDescribe() {
        return locationTypeDescribe;
    }

    public void setLocationTypeDescribe(String locationTypeDescribe) {
        this.locationTypeDescribe = locationTypeDescribe;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public String getUserIndoorState() {
        return userIndoorState;
    }

    public void setUserIndoorState(String userIndoorState) {
        this.userIndoorState = userIndoorState;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLocationDescrible() {
        return locationDescrible;
    }

    public void setLocationDescrible(String locationDescrible) {
        this.locationDescrible = locationDescrible;
    }

    public String getLocationDetail() {
        return locationDetail;
    }

    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSatelliteNumber() {
        return satelliteNumber;
    }

    public void setSatelliteNumber(String satelliteNumber) {
        this.satelliteNumber = satelliteNumber;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getGpsAccuracyStatus() {
        return gpsAccuracyStatus;
    }

    public void setGpsAccuracyStatus(String gpsAccuracyStatus) {
        this.gpsAccuracyStatus = gpsAccuracyStatus;
    }

    public String getLocateDescrible() {
        return locateDescrible;
    }

    public void setLocateDescrible(String locateDescrible) {
        this.locateDescrible = locateDescrible;
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }
}
