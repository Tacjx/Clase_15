package ar.edu.utn.ap40;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonProcessingException{
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		String archivo=new File("C:\\Users\\Usuario\\Desktop\\Git\\archivoClase15.csv").getAbsolutePath();
		
		
		int i=1;
		Producto prod=new Producto();
		Descuento des=new Descuento();
		
		try {
			for(String linea:Files.readAllLines(Paths.get(archivo))) {
				
				String[] values=linea.split(",");
				
				if(linea.charAt(i)==linea.charAt(1)) {
					prod.setNombre(values[0]);
					prod.setPeso(values[1]);
					prod.setPrecio(Integer.parseInt(values[2]));
				}else if(linea.charAt(i)==linea.charAt(2)) {
					des.setTipo(values[0]);
					des.setCantidad(Double.parseDouble(values[1]));
					des.setTope(Integer.parseInt(values[2]));
					
					des.setFechaDesde(values[3]);
					des.setFechaHasta(values[4]);
				}
				
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			String jsontext=objectMapper.writeValueAsString(prod);
			String jsontext2=objectMapper.writeValueAsString(des);
			
			System.out.println(jsontext);
			System.out.println(jsontext2);

	}

}
