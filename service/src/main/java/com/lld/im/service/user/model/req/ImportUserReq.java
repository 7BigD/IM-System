package com.lld.im.service.user.model.req;

import com.lld.im.common.model.RequestBase;
import com.lld.im.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;

/**
 * @Description: TODO
 * @Author: yuanhaosheng
 * @Version: 1.0
 */
@Data
public class ImportUserReq extends RequestBase {

    private List<ImUserDataEntity> userData; // 命名需要跟前端传过来requestBody 中 json 的key对应

}
