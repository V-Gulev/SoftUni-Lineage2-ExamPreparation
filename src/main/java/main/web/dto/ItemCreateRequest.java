package main.web.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import main.model.ItemType;
import org.hibernate.validator.constraints.URL;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemCreateRequest {

    @NotBlank
    @Size(min = 6, max = 26)
    private String name;

    @NotNull
    private ItemType type;

    @NotNull
    @Min(1)
    @Max(3)
    private double xpBonusMultiplier;

    @NotBlank
    @URL
    private String url;



}
