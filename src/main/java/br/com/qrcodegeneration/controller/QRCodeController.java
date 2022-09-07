package br.com.qrcodegeneration.controller;

import br.com.qrcodegeneration.model.QRCode;
import br.com.qrcodegeneration.service.QRCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(value="Generate QRCode")
@RestController
@RequestMapping(value="/api/v1")
public class QRCodeController {

    @Autowired
    private QRCodeService service;

    @ApiOperation(value="Generate QRCode",code = 201)
    @PostMapping(value = "/generate-qrcode",
    produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] generateQrCode(@RequestBody QRCode infosQrCode){
        byte[] qrcode = service.getBytesImage(infosQrCode);
        return qrcode;
    }
}
