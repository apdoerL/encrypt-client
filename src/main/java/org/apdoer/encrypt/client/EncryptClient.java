package org.apdoer.encrypt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author apdoer
 */
@FeignClient("encrypt-server")
public interface EncryptClient {

    /**
     * 加密
     * @param sStr
     * @return
     */
    @RequestMapping(value = "/encrypt", method = RequestMethod.GET)
    String encrypt(@RequestParam("sStr") String sStr);

    /**
     * 解密
     * @param sStr
     * @return
     */
    @RequestMapping(value = "/decrypt", method = RequestMethod.GET)
    String decrypt(@RequestParam("sStr") String sStr);
}
