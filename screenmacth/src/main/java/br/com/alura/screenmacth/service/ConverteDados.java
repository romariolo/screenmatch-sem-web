package br.com.alura.screenmacth.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConvertedados {
    private ObjectMapper mapper = new ObjectMapper();

    public ConverteDados(){

    }

    @Override
    public <T> T obeterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
