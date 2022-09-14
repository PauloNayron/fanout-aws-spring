package com.nayron.fanoutawsspring.fanoutawsspring.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Purchase {
  private String id;
  private String productId;
  private Long quantity;
}
