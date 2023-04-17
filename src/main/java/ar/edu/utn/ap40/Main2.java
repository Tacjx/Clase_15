package ar.edu.utn.ap40;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
	
	

	public static void main(String[] args)throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();

		
		Producto prod=new Producto("Hola","HOLA2",150);
		
		String jsonText = objectMapper.writeValueAsString(prod);
		System.out.println(jsonText);

		
		
	}

}
