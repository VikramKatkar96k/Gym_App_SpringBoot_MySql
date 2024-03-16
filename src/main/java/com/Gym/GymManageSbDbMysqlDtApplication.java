package com.Gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Gym.Entity.GymEntity;
import com.Gym.Respo.GymRespo;

@SpringBootApplication
public class GymManageSbDbMysqlDtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GymManageSbDbMysqlDtApplication.class, args);
		GymRespo bean = context.getBean(GymRespo.class);
		GymEntity obj = new GymEntity();
		obj.setId(1);
		obj.setMemberName("Vikram Katkar");
		System.out.println("data inserted");
		bean.save(obj);
	}

}
