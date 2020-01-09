package com.alibaba.pojo;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {
    @NonNull
    private String id;
    @NonNull
    private String name;
    @Min(0)
    @Max(200)
    private int age;
    private String address;
    @Min(0)
    @Max(1)
    private int sex;
    private boolean failure;
    @NonNull
    private Date optime;

    @NonNull
    private String username;
    private String password="123456";
}
