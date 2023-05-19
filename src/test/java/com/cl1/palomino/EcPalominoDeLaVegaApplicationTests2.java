package com.cl1.palomino;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cl1.palomino.Entity.Autos;
import com.cl1.palomino.Entity.Marca;
import com.cl1.palomino.service.MarcaService;



@SpringBootTest
class EcPalominoDeLaVegaApplicationTests2 {
	@Autowired
	private MarcaService servicio;
	@Test
	void contextLoads() {
		
		List<Marca> data=servicio.listarTodo();
		for(Marca a:data)
			System.out.println(a.getCodigo()+" --- "+a.getNombre());
	}

}
