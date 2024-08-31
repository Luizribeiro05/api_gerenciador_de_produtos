package br.com.gereciadordeprodutos.api.dtos;

import br.com.gereciadordeprodutos.api.enums.TipoFornecedorEnum;

public record CriarFornecedorRequest(
        String nome,
        String cnpj,
        String email,
        TipoFornecedorEnum tipoFornecedorEnum
) {
}
