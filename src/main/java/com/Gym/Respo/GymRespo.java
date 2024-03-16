package com.Gym.Respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gym.Entity.GymEntity;

public interface GymRespo extends JpaRepository<GymEntity, Integer> 
{

}
