package com.usermicroservice.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_details")
@Builder
public class UserEntity {
    @Id
    @Column (name = "uuid", length = 50)
    private String uuid;

    @Column (name = "user_name", length = 50)
    private String user_name;

    @Column (name = "user_email", length = 50)
    private String user_email;

    @Column (name = "user_phone", length = 15)
    private Long user_phone;

    @Column (name = "user_gender", length = 50)
    private String user_gender;

    @Column (name = "user_dob", length = 50)
    private String user_dob;

    @Column (name = "user_address", length = 100)
    private String user_address;
}
