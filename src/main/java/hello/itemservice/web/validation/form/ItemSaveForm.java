package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class ItemSaveForm {

    @NotNull(message = "아이템 이름은 필수입니다.")
    private String itemName;

    @NotNull(message = "금액은 필수입니다.")
    @Range(min = 100, max = 1000000)
    private Integer price;

    @NotNull(message = "수량은 필수입니다.")
    @Max(value = 9999)
    private Integer quantity;

}
