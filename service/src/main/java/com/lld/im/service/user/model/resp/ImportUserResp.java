package com.lld.im.service.user.model.resp;

import lombok.Data;

import java.util.List;

/**
 * @Description: TODO
 * @Author: yuanhaosheng
 * @Version: 1.0
 */
@Data
public class ImportUserResp {

    private List<String> susccessId;
    private List<String> errorId;

}