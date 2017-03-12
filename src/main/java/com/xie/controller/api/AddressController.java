package com.xie.controller.api;

import com.xie.bean.Address;
import com.xie.response.BaseResponse;
import com.xie.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author xie
 * @Date 17/1/22 下午3:52.
 */
@Controller
@RequestMapping(value = "/address")
public class AddressController extends BaseController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse get(@PathVariable("id") int id) {
        return BaseResponse.ok(addressService.getById(id));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    BaseResponse list(@RequestParam("uid") int uid) {
        return BaseResponse.ok(addressService.getByUid(uid));
    }

    @RequestMapping(value = "/getByUid", method = RequestMethod.GET)
    @ResponseBody
    BaseResponse getByUid(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                          @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,
                          HttpSession session) {
        return BaseResponse.ok(addressService.getByUid(getUid(session), pageNum, pageSize));
    }

    @RequestMapping(value = "/getDefaultByUid", method = RequestMethod.GET)
    @ResponseBody
    BaseResponse getDefaultByUid() {
        Integer uid = 2;
        return BaseResponse.ok(addressService.getDefaultByUid(uid));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse post(@ModelAttribute Address address) {
        int result = addressService.insert(address);
        if (result > 0) {
            return BaseResponse.ok();
        } else {
            return BaseResponse.fail();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public BaseResponse put(@PathVariable int id, @ModelAttribute Address address) {
        int result = addressService.update(address);
        if (result > 0) {
            return BaseResponse.ok();
        } else {
            return BaseResponse.fail();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public BaseResponse delete(@PathVariable int id) {
        int result = addressService.softDelete(id);
        if (result > 0) {
            return BaseResponse.ok();
        } else {
            return BaseResponse.fail();
        }

    }
}
