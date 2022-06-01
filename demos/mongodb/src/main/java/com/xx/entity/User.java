package com.xx.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author xiaoxing
 * @create 2022-03-10 10:28
 */

/**
 * mongodb名词概念
 * database   数据库
 * collection 集合（表，对比sql的table）
 * document   文档（行，对比sql的row）
 * field      域（字段，对比sql的column）
 *
 */


@Data
@Document("User")   //这的User就是MongoDB中的集合（表）
public class User {

    @Id
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String createDate;



}
