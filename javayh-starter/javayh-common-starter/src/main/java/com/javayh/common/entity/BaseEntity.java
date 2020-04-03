package com.javayh.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * 常用字段
 *      @DateTimeFormat(pattern = "yyyy-MM-dd")
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-04-03 10:43
 */
@Data
public class BaseEntity<T extends Object>implements Serializable {
    private static final long serialVersionUID = 170726482079531378L;

    /**创建人*/
    private String createBy;
    /**创建时间*/
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;
    /**修改人*/
    private String updateBy;
    /**修改时间*/
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;
    /**是否删除*/
    private String isDelete;

}
