package br.com.qrcodegeneration.service.impl;

import br.com.qrcodegeneration.QrcodeGenerationApplication;
import br.com.qrcodegeneration.model.QRCode;
import br.com.qrcodegeneration.service.QRCodeService;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@Service
public class QRCodeServiceImpl implements QRCodeService {

    private static Logger logger = LoggerFactory.getLogger(QrcodeGenerationApplication.class);
    public BufferedImage createQRCode(QRCode info){
        QRCodeWriter qrcode = new QRCodeWriter();
        try{
            logger.info("Iniciado processo de geracao de qr-code com os dados {}",info);
            BitMatrix matrix = qrcode.encode(info.getValue(), BarcodeFormat.QR_CODE,
                    info.getWidth(), info.getHeight());
            return MatrixToImageWriter.toBufferedImage(matrix);
        }catch(Exception e){
            logger.error("Erro ao gerar qr-code. Erro: {}",e.getMessage());
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
