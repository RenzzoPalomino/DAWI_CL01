package com.cl1.palomino;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cl1.palomino.Entity.Autos;



@SpringBootTest
class EcPalominoDeLaVegaApplicationTests {
	@Autowired
	private com.cl1.palomino.service.AutosService servicio;
	@Test
	void contextLoads() {
		
		List<Autos> data=servicio.listarTodo();
		for(Autos a:data)
			System.out.println(a.getDescripcion()+" --- "+a.getPrecio());
	}

}
