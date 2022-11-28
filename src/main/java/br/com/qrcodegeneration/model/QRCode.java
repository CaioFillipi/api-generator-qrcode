package br.com.qrcodegeneration.model;

import com.google.gson.Gson;
import io.swagger.annotations.ApiModelProperty;

public class QRCode {
    @ApiModelProperty(value = "Value that will be inserted in qr code")
    private String value;
    @ApiModelProperty(value = "Width for QRCode Generated")
    private int width;
    @ApiModelProperty(value = "Height for QRCode generated")
    private int height;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
