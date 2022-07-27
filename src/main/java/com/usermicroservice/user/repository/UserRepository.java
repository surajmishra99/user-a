package com.usermicroservice.user.repository;

import com.usermicroservice.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    @Query("select u from UserEntity u where u.user_email = :n")
    public List<UserEntity> getAll(@Param("n")  String d);
    @Query("select case when count(u)>0 then true else false end from UserEntity u where u.user_phone = :n")
    public boolean isExitNumber(@Param("n") Long number);

    @Query("select u from UserEntity u where u.user_phone = ?1")
    public List<UserEntity> selectAllByNumber(Long number);
}
