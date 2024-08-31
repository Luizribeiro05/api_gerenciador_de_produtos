package br.com.gerenciadordeprodutos.api.dtos;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CriarProdutoRequest(
        @NotBlank(message = "O nome não pode está em branco")
        @Size(max = 100, message = "O nome não pode ter mais de 100 caracteres")
        String nome,
        @NotNull(message = "o preço é obrigatorio")
        @Digits(integer = 13, fraction = 2, message = "o presço deve ter no máximo 10 digitos")
        @DecimalMin(value = "0.0", inclusive = false, message = " O precço deve ser maior do que 0.0")
        BigDecimal preco,
        @Size(max = 255, message = "A descrição não pode ter mais de 255 caracteres")
        String descricao,
        @NotNull(message = "O fornecedor é obrigatorio")
        Long fornecedorId
        ){
}
