package com.edenilsonfabiano.literAlura.service;

public interface IConverterDados {
    <T> T  obterDados(String json, Class<T> classe);
}
