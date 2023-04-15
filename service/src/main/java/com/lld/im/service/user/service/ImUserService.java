package com.lld.im.service.user.service;

import com.lld.im.common.ResponseVO;
import com.lld.im.service.user.model.req.ImportUserReq;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: yuanhaosheng
 * @Version: 1.0
 */
@Service
public interface ImUserService {

    ResponseVO importUser(ImportUserReq req);

}
