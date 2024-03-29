package com.stopboot.admin.base.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @version:0.0.1
 * @author: Lianyutao
 * @create: 2019-10-28 19:05
 * @description:
 **/

@Data
public class BaseMenuTreeVO implements Serializable {

    private Integer id;

    private Integer pid;

    private String path;

    private String fullPath;

    private List<BaseMenuTreeVO> children = new ArrayList<>();
}
