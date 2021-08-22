package com.example.newViaCep.rest;

import java.io.IOException;

import com.example.newViaCep.entity.AddressEntity;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * 
 * @author Chrystian Rocha
 *
 */
public class JacksonCustomAddressEntitySerializer extends StdSerializer<AddressEntity> {

	private static final long serialVersionUID = -4022690158064513181L;

	public JacksonCustomAddressEntitySerializer() {
		this(null);
	}

	protected JacksonCustomAddressEntitySerializer(Class<AddressEntity> t) {
		super(t);
	}

	@Override
	public void serialize(AddressEntity address, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		
		jgen.writeStartObject();

		jgen.writeStringField("cep", address.getZipCode());
		jgen.writeStringField("Logradouro", address.getPublicPlace());
	
		jgen.writeEndObject();
	}
}
