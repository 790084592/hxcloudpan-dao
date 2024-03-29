package com.hx.hxcloudpan.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hx.hxcloudpan.dao.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {


	public UserEntity save(UserEntity user);

}
