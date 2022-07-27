package com.usermicroservice.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @NotNull(message = "User Name Field are Required Please fill ")
    @Size(min = 4,  message = "Minimum 4 Character are Required")
    private String user_name;

    @NotNull(message = "Email Field are Required Please fill ")
    @Email(message = "Please follow valid email convention")
    private String user_email;

    @NotNull(message = "Please Fill Valid Mobile NO.")
    @Size(min = 10, max = 10, message = "Please enter valid mobile no.")
    private Long user_phone;

    @NotNull(message = "Please Select Your Gender")
    private String user_gender;

    @NotNull(message = "Please Fill Date of Birth")
//    @Pattern(regexp="\\d{4}(1[012]|0[1-9])(3[01]|[12]\\d|0[0-9])", message = "yyyyMMdd")
    private String user_dob;

    @NotNull(message = "Please Fill Your Address")
    private String user_address;
}
