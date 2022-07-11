package br.com.macielgoncalves.grpc.service;

import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;

import java.util.List;

public interface IProductService {
    ProductOutputDTO create(ProductInputDTO inputDTO);
    ProductOutputDTO findById(Long id);
    void delete(Long id);
    List<ProductOutputDTO> findAll();
}
