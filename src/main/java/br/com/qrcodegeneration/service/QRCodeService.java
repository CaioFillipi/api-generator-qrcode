package br.com.qrcodegeneration.service;

import br.com.qrcodegeneration.model.QRCode;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@Service
public class QRCodeService {

    public BufferedImage createQRCode(QRCode info){
        QRCodeWriter qrcode = new QRCodeWriter();
        try{
            BitMatrix matrix = qrcode.encode(info.getValue(), BarcodeFormat.QR_CODE,
                    info.getWidth(), info.getHeight());
            return MatrixToImageWriter.toBufferedImage(matrix);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public byte[] getBytesImage(QRCode qrcode){
        BufferedImage image = createQRCode(qrcode);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            ImageIO.write(image,"png",baos);
            byte[] result = baos.toByteArray();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
