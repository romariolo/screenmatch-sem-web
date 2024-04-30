package br.com.alura.screenmacth.service;

public interface IConvertedados {
    <T> T obeterDados(String json, Class<T> classe);
}
