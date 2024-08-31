package br.com.gerenciadordeprodutos.api.dtos;

import br.com.gerenciadordeprodutos.api.enums.TipoFornecedorEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CNPJ;

public record CriarFornecedorRequest(
        @NotBlank(message = "O nome não pode está em branco")
        @Size(max = 100, message = "O nome não pode ter mais de 100 caracteres")
        String nome,
        @CNPJ(message = "CNPJ invalido")
        String cnpj,
        @Email(message = "Email invalido")
        String email,
        @NotNull(message = "O tipo do fornecedor é obrigatório")
        TipoFornecedorEnum tipoFornecedor
) {
}