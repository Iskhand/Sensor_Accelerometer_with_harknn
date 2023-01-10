package com.example.sensoraccwithhar_knn;

import com.google.firebase.database.IgnoreExtraProperties;

public class Data {
    private String sensor_x;
    private String sensor_y;
    private String sensor_z;
    private String result;

    public Data()
    {
    }
    public String getSensor_x(){
        return sensor_x;
    }
    public void setSensor_x(String sensor_x){
        this.sensor_x = sensor_x;
    }
    public String getSensor_y(){
        return sensor_y;
    }
    public void setSensor_y(String sensor_y){
        this.sensor_y = sensor_y;
    }
    public String getSensor_z(){
        return sensor_z;
    }
    public void setSensor_z(String sensor_z){
        this.sensor_z = sensor_z;
    }
    public String getResult(){
        return result;
    }
    public void setResult(String result){
        this.result = result;
    }

    @Override
    public String toString(){
        return "" + sensor_x + "\n" + sensor_y + "\n" + sensor_z + "\n" + result + "\n";
    }
    public Data(String currentX, String currentY, String currentZ, String var_result){
        sensor_x = currentX;
        sensor_y = currentY;
        sensor_z = currentZ;
        result = var_result;
    }
}
