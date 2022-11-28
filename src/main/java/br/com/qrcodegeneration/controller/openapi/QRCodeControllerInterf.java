package br.com.qrcodegeneration.controller.openapi;

import br.com.qrcodegeneration.model.QRCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface QRCodeControllerInterf {

    @ApiOperation(value="Generate QRCode",code = 201)
    @PostMapping(value = "/generate-qrcode",
            produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody byte[] generateQrCode(@RequestBody QRCode infosQrCode);
}
