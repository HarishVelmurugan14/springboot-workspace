package org.example.evaluations.evaluation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.example.evaluations.evaluation.models.AmazonProduct;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmazonProductDataDto {
    private List<AmazonProduct> products;
}
