package com.ohgiraffers.restapi.section05.swagger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private int no;

    //    @NotNull(message= "아이디는 반드시 입력되어야 합니다.")
    @NotBlank(message = "아이디는 공백일 수 없습니다.")
    private String id;
    private String pwd;

    @NotNull(message = "이름은 반드시 입력되어야 합니다.")
    @Size(min = 2, message = "이름은 두글자 이상 입력해야 합니다.")
    private String name;

    @Past
    private LocalDate enrollDate;
}
