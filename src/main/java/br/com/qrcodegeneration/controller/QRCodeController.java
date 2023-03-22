package br.com.qrcodegeneration.controller;

import br.com.qrcodegeneration.QrcodeGenerationApplication;
import br.com.qrcodegeneration.controller.openapi.QRCodeControllerInterf;
import br.com.qrcodegeneration.model.QRCode;
import br.com.qrcodegeneration.service.QRCodeService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="Generate QRCode")
@RestController
@RequestMapping(value="/api/v1")
public class QRCodeController implements QRCodeControllerInterf {

    private final QRCodeService service;

    public QRCodeController(QRCodeService service) {
        this.service = service;
    }

    private static Logger logger = LoggerFactory.getLogger(QrcodeGenerationApplication.class);


    public @ResponseBody byte[] generateQrCode(@RequestBody QRCode infosQrCode){
        logger.info("Chamada do end-point para geracao de qr-code");
        byte[] qrcode = service.getBytesImage(infosQrCode);
        return qrcode;
    }
}
