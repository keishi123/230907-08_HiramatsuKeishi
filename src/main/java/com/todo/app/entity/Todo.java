package com.todo.app.entity;

import lombok.Data;

@Data //lombokのGetter・Setter自動生成のためのもの
public class Todo {

    private long id;
    private String title;
    private String category;
    private int done_flg;
    private String time_limit;
}