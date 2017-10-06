package com.basquet.data;

import com.basquet.data.Entity.Jugador;
import com.basquet.data.Service.EquipoService;
import com.basquet.data.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { DataApplication.class, Jsr310JpaConverters.class }
)

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataApplication.class, args);

		EquipoService equipoService =context.getBean(EquipoService.class);

		JugadorService jugadorService =context.getBean(JugadorService.class);

		equipoService.testEquipo();
		jugadorService.testJugador();
	}
}
