package br.com.qrcodegeneration.service;

import br.com.qrcodegeneration.model.QRCode;

import java.awt.image.BufferedImage;

public interface QRCodeService {
    BufferedImage createQRCode(QRCode info);
    byte[] getBytesImage(QRCode qrcode);
}
