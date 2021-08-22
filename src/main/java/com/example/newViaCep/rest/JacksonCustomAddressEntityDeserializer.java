package com.example.newViaCep.rest;

import java.io.IOException;

import com.example.newViaCep.entity.AddressEntity;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * 
 * @author Chrystian Rocha
 *
 */
public class JacksonCustomAddressEntityDeserializer extends StdDeserializer<AddressEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3413827126625189247L;

	public JacksonCustomAddressEntityDeserializer() {
		this(null);
	}

	public JacksonCustomAddressEntityDeserializer(Class<AddressEntity> t) {
		super(t);
	}

	@Override
	public AddressEntity deserialize(JsonParser parser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		
		JsonNode node = parser.getCodec().readTree(parser);
		AddressEntity address = new AddressEntity();
		String zipCode = node.get("cep").asText(null);
		String publicPlace = node.get("logradouro").asText(null);
		
		address.setZipCode(zipCode);
		address.setPublicPlace(publicPlace);
		
		return address;
	}

}
