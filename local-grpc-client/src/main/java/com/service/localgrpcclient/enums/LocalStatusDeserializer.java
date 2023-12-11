package com.service.localgrpcclient.enums;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class LocalStatusDeserializer extends StdDeserializer<LocalStatus> {

    public LocalStatusDeserializer() {
        this(null);
    }

    public LocalStatusDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalStatus deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        String enumValue = node.asText();

        // Map the received enum value to the corresponding enum in your Spring Boot representation
        switch (enumValue) {
            case "Loué":
                return LocalStatus.loue;
            case "Fermé":
                return LocalStatus.ferme;
            case "Proprietaire":
                return LocalStatus.proprietaire;
            case "En reparation":
                return LocalStatus.en_reparation;
            default:
                throw new IllegalArgumentException("Invalid value for LocalStatus enum: " + enumValue);
        }
    }
}