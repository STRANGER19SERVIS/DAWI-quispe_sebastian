package pe.edu.i202215458.cl1_jpa_data_Quispe_Sebastian.entidades;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguagePk {
    private String Language;
    private String CountryCode;
}