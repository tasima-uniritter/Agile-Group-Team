package com.uniritter.agwt.eventos.domain;

import com.uniritter.agwt.eventos.domain.interfaces.IDesconto;

public class DescontoIdoso implements IDesconto {
    @Override
    public Double CalculaDesconto(Double valor) {
        return valor * 0.5;
    }
}
