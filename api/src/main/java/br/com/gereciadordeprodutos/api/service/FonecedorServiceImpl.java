package br.com.gereciadordeprodutos.api.service;

import br.com.gereciadordeprodutos.api.dtos.CriarFornecedorRequest;
import br.com.gereciadordeprodutos.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FonecedorServiceImpl implements FornecedorService{

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Override
    public void criarFornecedor(CriarFornecedorRequest criarFornecedorRequest) {

    }
}
