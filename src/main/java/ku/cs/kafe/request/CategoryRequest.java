// ทิเบต เจริญศรีไพบูลย์ 6510450399
package ku.cs.kafe.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CategoryRequest {


    @NotBlank
    private String name;


}
