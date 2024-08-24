package br.com.gereciadordeprodutos.api.service;

import br.com.gereciadordeprodutos.api.dtos.CriarFornecedorRequest;
import org.springframework.stereotype.Service;

@Service
public interface FornecedorService {
    // primeira assinatura: cração do fornecedor
    void criarFornecedor(CriarFornecedorRequest criarFornecedorRequest);
}
